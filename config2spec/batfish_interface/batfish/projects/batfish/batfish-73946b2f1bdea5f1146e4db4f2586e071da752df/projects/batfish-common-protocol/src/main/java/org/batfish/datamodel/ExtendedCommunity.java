package org.batfish.datamodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.batfish.common.BatfishException;

/** Represents extended BGP community, as described in RFC4360 */
public final class ExtendedCommunity implements Serializable {

  private static final long serialVersionUID = 1L;

  private final long _value;

  @JsonCreator
  public ExtendedCommunity(long value) {
    _value = value;
  }

  public ExtendedCommunity(long part1, long part2, long part3) {
    _value = (part1 & 0xFFFFL) | ((part2 & 0xFFFFFFFFL) << 16) | ((part3 & 0xFFFFL) << 48);
  }

  public ExtendedCommunity(String communityStr) {
    long value = 0L;
    byte subTypeByte;
    byte typeByte;
    long gaLong;
    long laLong;
    int gaBytes;
    String[] parts = communityStr.split(":");
    String subType = parts[0].toLowerCase();
    String globalAdministrator = parts[1].toLowerCase();
    String localAdministrator = parts[2].toLowerCase();

    switch (subType) {
      case "target":
        subTypeByte = 0x02;
        break;

      case "origin":
        subTypeByte = 0x03;
        break;

      default:
        throw new BatfishException(
            "Invalid extended community subtype: \""
                + subType
                + "\" for community: \""
                + communityStr
                + "\"");
    }
    String[] gaParts = globalAdministrator.split("\\.");
    laLong = Long.parseLong(localAdministrator);
    if (gaParts.length == 4) {
      // type 0x01, 1-byte subtype, 4-byte ip address, 2-byte number la
      typeByte = 0x01;
      gaLong = new Ip(globalAdministrator).asLong();
      gaBytes = 4;
    } else if (gaParts.length == 2) {
      // type 0x02, 1-byte subtype, 2-byte.2-byte dotted as, 2-byte number la
      typeByte = 0x02;
      long high = Long.parseLong(gaParts[0]);
      long low = Long.parseLong(gaParts[1]);
      gaLong = low + (high << 16);
      gaBytes = 4;
    } else if (!globalAdministrator.endsWith("l")) {
      // type 0x00, 1-byte subtype, 2-byte number ga, 4-byte number la
      gaLong = Long.parseLong(globalAdministrator);
      typeByte = 0x00;
      gaBytes = 2;
    } else {
      // type 0x02, 1-byte subtype, 4-byte number ga, 2-byte number la
      typeByte = 0x02;
      String globalAdministratorDigits =
          globalAdministrator.substring(0, globalAdministrator.length() - 1);
      gaLong = Long.parseLong(globalAdministratorDigits);
      gaBytes = 4;
    }
    int subTypeOffset = 8;
    int gaOffset = subTypeOffset + 8;
    int laOffset = gaOffset + (gaBytes * 8);
    value |= typeByte;
    value |= ((long) subTypeByte) << subTypeOffset;
    value |= gaLong << gaOffset;
    value |= laLong << laOffset;
    _value = value;
  }

  @JsonValue
  public long asLong() {
    return _value;
  }

  @Override
  public boolean equals(@Nullable Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof ExtendedCommunity)) {
      return false;
    }
    return _value == ((ExtendedCommunity) obj)._value;
  }

  @Override
  public int hashCode() {
    return Long.hashCode(_value);
  }

  @Override
  public @Nonnull String toString() {
    return Long.toString(_value);
  }
}
