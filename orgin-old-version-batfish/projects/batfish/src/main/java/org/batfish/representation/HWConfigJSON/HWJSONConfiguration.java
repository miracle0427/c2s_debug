package org.batfish.representation.HWConfigJSON;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import org.apache.commons.collections4.list.TreeList;
import org.batfish.common.VendorConversionException;
import org.batfish.datamodel.*;
import org.batfish.datamodel.acl.MatchHeaderSpace;
import org.batfish.datamodel.ospf.OspfArea;
import org.batfish.datamodel.ospf.OspfProcess;
import org.batfish.datamodel.ospf.StubType;
import org.batfish.datamodel.routing_policy.RoutingPolicy;
import org.batfish.datamodel.vendor_family.VendorFamily;
import org.batfish.datamodel.vendor_family.cisco.CiscoFamily;
import org.batfish.vendor.VendorConfiguration;

import java.util.*;

public class HWJSONConfiguration extends VendorConfiguration {
  private static final long serialVersionUID = 1L;
  public String _hostName;
  public ConfigurationFormat _vendor;
  public String _jsonStr;
  public Map<Object, Object> _jsonObj;

  public void setJsonData(String s) {
    _jsonStr = s;
    try {
      ObjectMapper mapper = new ObjectMapper();
      _jsonObj = mapper.readValue(_jsonStr, new TypeReference<Map<Object, Object>>() {});
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public String getHostname() {
    return _hostName;
  }

  @Override
  public void setHostname(String s) {
    _hostName = s;
  }

  @Override
  public void setVendor(ConfigurationFormat configurationFormat) {
    _vendor = configurationFormat;
  }

  @Override
  public List<Configuration> toVendorIndependentConfigurations() throws VendorConversionException {
    try {
      Configuration c = new Configuration(_hostName, _vendor);
      VendorFamily vf = new VendorFamily();
      vf.setCisco(new CiscoFamily());
      c.setVendorFamily(vf);
      c.setDefaultInboundAction(LineAction.PERMIT);
      c.setDefaultCrossZoneAction(LineAction.PERMIT);

      // TODO: set ipAccessLists
      NavigableMap<String, IpAccessList> c_ipAccessLists = new TreeMap<>();
      @SuppressWarnings("unchecked")
      Map<Object, Object> ipAccessLists = (Map<Object, Object>) _jsonObj.get("ipAccessLists");
      for (Object ipAccessListsKey : ipAccessLists.keySet()) {
        @SuppressWarnings("unchecked")
        Map<Object, Object> ipAccessList =
            (Map<Object, Object>) ipAccessLists.get(ipAccessListsKey);
        String ipAccessList_name = (String) ipAccessList.get("name");
        List<IpAccessListLine> lines = new TreeList<>();
        @SuppressWarnings("unchecked")
        List<Object> line = (List<Object>) ipAccessList.get("lines");

        // lines
        for (int i = 0; i < line.size(); ++i) {
          @SuppressWarnings("unchecked")
          Map<String, Object> currentLineJsonObj = (Map<String, Object>) line.get(i);

          // action
          LineAction aclLine_action = LineAction.valueOf((String) currentLineJsonObj.get("action"));

          // name
          String aclLine_name = (String) currentLineJsonObj.get("name");

          // matchCondition
          HeaderSpace headerSpace = new HeaderSpace();
          @SuppressWarnings("unchecked")
          Map<Object, Object> matchConditionMap =
              (Map<Object, Object>) currentLineJsonObj.get("matchCondition");
          @SuppressWarnings("unchecked")
          Map<Object, Object> headerSpaceMap =
              (Map<Object, Object>) matchConditionMap.get("headerSpace");

          // dstIps
          @SuppressWarnings("unchecked")
          Map<Object, Object> dstIpsMap = (Map<Object, Object>) headerSpaceMap.get("dstIps");
          IpWildcard dstIps_ipWildcard = new IpWildcard((String) dstIpsMap.get("ipWildcard"));
          IpWildcardIpSpace dstIps = new IpWildcardIpSpace(dstIps_ipWildcard);
          headerSpace.setDstIps(dstIps);

          // srcIps
          @SuppressWarnings("unchecked")
          Map<Object, Object> srcIpsMap = (Map<Object, Object>) headerSpaceMap.get("srcIps");
          IpWildcard srcIps_ipWildcard = new IpWildcard((String) srcIpsMap.get("ipWildcard"));
          IpWildcardIpSpace srcIps = new IpWildcardIpSpace(srcIps_ipWildcard);
          headerSpace.setSrcIps(srcIps);

          // ipProtocols
          SortedSet<IpProtocol> ipProtocols = new TreeSet<>();
          @SuppressWarnings("unchecked")
          List<Object> ipProtocolsList = (List<Object>) headerSpaceMap.get("ipProtocols");
          for (int i_ipProtocolsList = 0;
              i_ipProtocolsList < ipProtocolsList.size();
              ++i_ipProtocolsList) {
            String ipProtocolString = (String) ipProtocolsList.get(i_ipProtocolsList);
            IpProtocol ipProtocol = IpProtocol.valueOf(ipProtocolString);
            ipProtocols.add(ipProtocol);
          }
          headerSpace.setIpProtocols(ipProtocols);

          // dstPorts
          SortedSet<SubRange> dstPorts = new TreeSet<>();
          @SuppressWarnings("unchecked")
          List<Object> dstPortsList = (List<Object>) headerSpaceMap.get("dstPorts");
          for (int i_dstPortsList = 0; i_dstPortsList < dstPortsList.size(); ++i_dstPortsList) {
            String dstPortString = (String) dstPortsList.get(i_dstPortsList);
            String[] parts = dstPortString.split("-");
            SubRange dstPort = new SubRange(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            dstPorts.add(dstPort);
          }
          headerSpace.setDstPorts(dstPorts);

          // srcPorts
          SortedSet<SubRange> srcPorts = new TreeSet<>();
          @SuppressWarnings("unchecked")
          List<Object> srcPortsList = (List<Object>) headerSpaceMap.get("srcPorts");
          for (int i_srcPortsList = 0; i_srcPortsList < srcPortsList.size(); ++i_srcPortsList) {
            String srcPortString = (String) srcPortsList.get(i_srcPortsList);
            String[] parts = srcPortString.split("-");
            SubRange srcPort = new SubRange(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            srcPorts.add(srcPort);
          }
          headerSpace.setSrcPorts(srcPorts);

          // icmpTypes
          SortedSet<SubRange> icmpTypes = new TreeSet<>();
          @SuppressWarnings("unchecked")
          List<Object> icmpTypesList = (List<Object>) headerSpaceMap.get("icmpTypes");
          for (int i_icmpTypesList = 0; i_icmpTypesList < icmpTypesList.size(); ++i_icmpTypesList) {
            String icmpTypeString = (String) icmpTypesList.get(i_icmpTypesList);
            String[] parts = icmpTypeString.split("-");
            SubRange icmpType =
                new SubRange(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            icmpTypes.add(icmpType);
          }
          headerSpace.setIcmpTypes(icmpTypes);

          // icmpCodes
          SortedSet<SubRange> icmpCodes = new TreeSet<>();
          @SuppressWarnings("unchecked")
          List<Object> icmpCodesList = (List<Object>) headerSpaceMap.get("icmpCodes");
          for (int i_icmpCodesList = 0; i_icmpCodesList < icmpCodesList.size(); ++i_icmpCodesList) {
            String icmpCodeString = (String) icmpCodesList.get(i_icmpCodesList);
            String[] parts = icmpCodeString.split("-");
            SubRange icmpCode =
                new SubRange(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
            icmpCodes.add(icmpCode);
          }
          headerSpace.setIcmpCodes(icmpCodes);

          MatchHeaderSpace matchHeaderSpace = new MatchHeaderSpace(headerSpace);
          IpAccessListLine ipAccessList1 =
              new IpAccessListLine(aclLine_action, matchHeaderSpace, aclLine_name);
          lines.add(ipAccessList1);
        }

        // IpAccessList
        IpAccessList currentIpAccessList = new IpAccessList(ipAccessList_name, lines, null, null);
        c_ipAccessLists.put(ipAccessList_name, currentIpAccessList);
      }
      c.setIpAccessLists(c_ipAccessLists);

      // TODO: set asPathAccessLists
      NavigableMap<String, AsPathAccessList> c_AsPathAccessLists = new TreeMap<>();
      @SuppressWarnings("unchecked")
      Map<Object, Object> tmpCheckMap = (Map<Object, Object>) _jsonObj.get("asPathAccessLists");
      if (!(tmpCheckMap).isEmpty()) {
        @SuppressWarnings("unchecked")
        Map<Object, Object> json_asPathAccessLists =
            (Map<Object, Object>)
                ((Map<Object, Object>) _jsonObj.get("asPathAccessLists")).get("local");
        String asPathAccessListName = (String) json_asPathAccessLists.get("name");
        @SuppressWarnings("unchecked")
        List<Map<Object, Object>> lines =
            (List<Map<Object, Object>>) json_asPathAccessLists.get("lines");
        List<AsPathAccessListLine> asPathAccessListLines = new ArrayList<AsPathAccessListLine>();
        for (int i = 0; i < lines.size(); i++) {
          asPathAccessListLines.add(
              new AsPathAccessListLine(
                  "PERMIT".equals((String) lines.get(i).get("action"))
                      ? LineAction.PERMIT
                      : LineAction.DENY,
                  (String) lines.get(i).get("regex")));
        }
        AsPathAccessList asPathAccessList =
            new AsPathAccessList(asPathAccessListName, asPathAccessListLines);
        c_AsPathAccessLists.put(asPathAccessListName, asPathAccessList);
        c.setAsPathAccessLists(c_AsPathAccessLists);
      }

      // TODO: routingPolices
      NavigableMap<String, RoutingPolicy> routingPolicies = new TreeMap<>();
      @SuppressWarnings("unchecked")
      Map<String, Object> routingPoliciesJsonMap =
          (Map<String, Object>) _jsonObj.get("routingPolicies");
      for (String key : routingPoliciesJsonMap.keySet()) {
        @SuppressWarnings("unchecked")
        LinkedHashMap<Object, Object> hashMap =
            (LinkedHashMap<Object, Object>) routingPoliciesJsonMap.get(key);
        ObjectMapper objMapper = new ObjectMapper();
        String jsonString = null;
        try {
          jsonString = objMapper.writeValueAsString(hashMap);
        } catch (Exception e) {
          e.printStackTrace();
        }
        // jsonString -ready
        try {

          jsonString =
              jsonString
                  .replace(
                      "\"class\":\"org.batfish.datamodel.routing_policy.statement.SetTag\",\"tag\":{\"class\":\"org.batfish.datamodel.routing_policy.expr.LiteralLong",
                      "\"class\":\"org.batfish.datamodel.routing_policy.statement.SetTag\",\"tag\":{\"class\":\"org.batfish.datamodel.routing_policy.expr.LiteralInt")
                  .replace("ebgp", "bgp")
                  .replace(
                      "{\"class\":\"org.batfish.datamodel.routing_policy.expr.MatchProcessId\",\"comment\":null},",
                      "")
                  .replace(
                      "{\"class\":\"org.batfish.datamodel.routing_policy.expr.MatchProcessId\",\"comment\":null}",
                      "");
          RoutingPolicy routingPolicy = objMapper.readValue(jsonString, RoutingPolicy.class);
          routingPolicy.setOwner(c);
          routingPolicies.put(key, routingPolicy);
        } catch (Exception e) {
          System.out.println(
              "[ERROR_KEY]: "
                  + key
                  + " < < < < < < Creating routingPolicies > > > > > >"
                  + _hostName);
          e.printStackTrace();
        }
      }
      c.setRoutingPolicies(routingPolicies);

      // TODO: set CommunityLists
      NavigableMap<String, CommunityList> communityLists = new TreeMap<>();
      @SuppressWarnings("unchecked")
      Map<String, Object> communityListsJsonMap =
          (Map<String, Object>) _jsonObj.get("communityLists");
      for (String key : communityListsJsonMap.keySet()) {
        @SuppressWarnings("unchecked")
        LinkedHashMap<Object, Object> hashMap =
            (LinkedHashMap<Object, Object>) communityListsJsonMap.get(key);
        ObjectMapper objMapper = new ObjectMapper();
        String jsonString = null;
        try {
          jsonString = objMapper.writeValueAsString(hashMap);
        } catch (Exception e) {
          e.printStackTrace();
        }
        try {
          CommunityList communityList = objMapper.readValue(jsonString, CommunityList.class);
          communityLists.put(key, communityList);
        } catch (Exception e) {
          System.out.println(
              "[ERROR_KEY]: "
                  + key
                  + " < < < < < < Creating communityLists > > > > > >"
                  + _hostName);
          e.printStackTrace();
        }
      }
      c.setCommunityLists(communityLists);

      // TODO: set RouteFilterLists
      NavigableMap<String, RouteFilterList> routeFilterLists = new TreeMap<>();
      @SuppressWarnings("unchecked")
      Map<String, Object> routeFilterListsJsonMap =
          (Map<String, Object>) _jsonObj.get("routeFilterLists");
      for (String key : routeFilterListsJsonMap.keySet()) {
        @SuppressWarnings("unchecked")
        LinkedHashMap<Object, Object> hashMap =
            (LinkedHashMap<Object, Object>) routeFilterListsJsonMap.get(key);
        ObjectMapper objMapper = new ObjectMapper();
        String jsonString = null;
        try {
          jsonString = objMapper.writeValueAsString(hashMap);
        } catch (Exception e) {
          e.printStackTrace();
        }
        try {
          RouteFilterList routeFilterList = objMapper.readValue(jsonString, RouteFilterList.class);
          routeFilterLists.put(key, routeFilterList);
        } catch (Exception e) {
          System.out.println(
              "[ERROR_KEY]: "
                  + key
                  + " < < < < < < Creating routeFilterLists > > > > > >"
                  + _hostName);
          e.printStackTrace();
        }
      }
      c.setRouteFilterLists(routeFilterLists);

      // TODO: set vrfs
      @SuppressWarnings("unchecked")
      Map<String, Vrf> c_vrfs = getVrfs((Map<Object, Object>) _jsonObj.get("vrfs"));
      c.setVrfs(c_vrfs);

      // TODO: set interfaces
      NavigableMap<String, Interface> c_interface = new TreeMap<>();
      @SuppressWarnings("unchecked")
      Map<Object, Object> interfaces = (Map<Object, Object>) _jsonObj.get("interfaces");
      for (Object interfaceKey : interfaces.keySet()) {

        @SuppressWarnings("unchecked")
        Map<Object, Object> interfaceJson = (Map<Object, Object>) interfaces.get(interfaceKey);
        String interface_type_string = (String) interfaceJson.get("type");
        String interface_name = (String) interfaceJson.get("name");
        /*
                    if(interface_name.equals("MEth0/0/0")){
                        continue;
                    }
        */
        if (interface_type_string.equals("NVE")) {
          interface_type_string = "VLAN";
        }

        Boolean active = (Boolean) interfaceJson.get("active");
        Boolean switchport = (Boolean) interfaceJson.get("switchport");
        Boolean autostate = (Boolean) interfaceJson.get("autostate");
        String switchportMode_string = (String) interfaceJson.get("switchportMode");
        if (switchportMode_string.equals("HYBRID")) {
          switchportMode_string = "TRUNK";
        }
        SwitchportMode switchportMode = SwitchportMode.valueOf(switchportMode_string);
        Integer accessVlan = (Integer) interfaceJson.get("accessVlan");
        Integer nativeVlan = (Integer) interfaceJson.get("nativeVlan");
        Double bandwidth = (Double) interfaceJson.get("bandwidth");
        int mtu = (int) interfaceJson.get("mtu");

        String channelGroup = (String) interfaceJson.get("channelGroup");
        SwitchportEncapsulationType switchportEncapsulationType =
            SwitchportEncapsulationType.valueOf(
                (String) interfaceJson.get("switchportTrunkEncapsulation"));

        IntegerSpace allowedVLans = IntegerSpace.create((String) interfaceJson.get("allowedVlans"));

        InterfaceAddress prefix = null;
        if (interfaceJson.get("prefix") != null && !"".equals(interfaceJson.get("prefix"))) {
          prefix = new InterfaceAddress((String) interfaceJson.get("prefix"));
        }
        Set<InterfaceAddress> allAddresses = new HashSet<>();
        Object allprefixes = interfaceJson.get("allPrefixes");

        if (allprefixes != null) {
          @SuppressWarnings("unchecked")
          ArrayList<String> tmp_allPrefixes = (ArrayList<String>) allprefixes;
          for (int i = 0; i < tmp_allPrefixes.size(); i++) {
            allAddresses.add(new InterfaceAddress(tmp_allPrefixes.get(i)));
          }
        }
        String incomingFilterKey = (String) interfaceJson.get("incomingFilter");
        String outgoingFilterKey = (String) interfaceJson.get("outgoingFilter");
        String vrfKey = (String) interfaceJson.get("vrf");
        // OSPFs
        String networkTypeName = (String) interfaceJson.get("ospfInterfaceType");
        int ospfHelloInterval = (int) interfaceJson.get("ospfTimerHelloInterval");
        boolean ospfEnable = (boolean) interfaceJson.get("ospfEnabled");
        boolean ospfPassive = (boolean) interfaceJson.get("ospfPassive");
        Object area = interfaceJson.get("ospfArea");
        Integer cost = (Integer) interfaceJson.get("ospfCost");
        Long ospfArea = null;
        if (area != null) {
          ospfArea = ((Integer) area).longValue();
        }
        if (networkTypeName.equals("P2P")) {
          networkTypeName = "POINT_TO_POINT";
        }

        InterfaceType interface_type = InterfaceType.valueOf(interface_type_string);
        Interface interface_obj = new Interface(interface_name, c, interface_type);

        interface_obj.setOspfCost(cost);
        interface_obj.setOspfDeadInterval(0);
        interface_obj.setOspfHelloMultiplier(0);
        interface_obj.setOspfAreaName(ospfArea);
        interface_obj.setOspfEnabled(ospfEnable);
        interface_obj.setOspfPassive((ospfPassive));
        interface_obj.setOspfPointToPoint(false);

        interface_obj.setActive(active);
        interface_obj.setSwitchport(switchport);
        interface_obj.setAutoState(autostate);
        interface_obj.setSwitchportMode(switchportMode);
        interface_obj.setNativeVlan(nativeVlan);
        interface_obj.setAccessVlan(accessVlan);
        interface_obj.setBandwidth(bandwidth);
        interface_obj.setMtu(mtu);
        interface_obj.setChannelGroup(channelGroup);
        interface_obj.setSwitchportTrunkEncapsulation(switchportEncapsulationType);
        interface_obj.setAllowedVlans(allowedVLans);
        interface_obj.setVrf(c.getVrfs().get(vrfKey));
        // interface_obj.setIncomingFilter(c.getIpAccessLists().get(incomingFilterKey));
        // interface_obj.setOutgoingFilter(c.getIpAccessLists().get(outgoingFilterKey));
        if (prefix != null) {
          interface_obj.setAddress(prefix);
        }
        interface_obj.setAllAddresses(allAddresses);
        if (incomingFilterKey != null) {
          if (!incomingFilterKey.equals("null")) {
            interface_obj.setIncomingFilter(c.getIpAccessLists().get(incomingFilterKey));
          }
        }
        if (outgoingFilterKey != null) {
          if (!outgoingFilterKey.equals("null")) {
            interface_obj.setOutgoingFilter(c.getIpAccessLists().get(outgoingFilterKey));
          }
        }
        interface_obj._owner = c;
        c_interface.put(interface_name, interface_obj);
      }
      c.setInterfaces(c_interface);
      // TODO: Set interface.class to vrf
      for (String vrf_name : c.getVrfs().keySet()) {
        Vrf current_vrf = c.getVrfs().get(vrf_name);
        NavigableMap<String, Interface> interfaces_to_vrf = new TreeMap<>();
        for (String interface_name : current_vrf.getInterfaceNames()) {
          Interface current_interface = c.getAllInterfaces().get(interface_name);
          interfaces_to_vrf.put(interface_name, current_interface);
        }
        c.getVrfs().get(vrf_name).setInterfaces(interfaces_to_vrf);
        // c.getVrfs().get(vrf_name).setInterfaceNames(new TreeSet<>());
      }

      return ImmutableList.of(c);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  // get Vrfs from the json Map
  private Map<String, Vrf> getVrfs(Map<Object, Object> jsonMap) {
    Map<String, Vrf> vrfs = new TreeMap<>();

    for (Object vrfKey : jsonMap.keySet()) {
      @SuppressWarnings("unchecked")
      Map<String, Object> vrfMap = (Map<String, Object>) jsonMap.get(vrfKey);
      String vrfName = (String) vrfMap.get("name");
      Vrf vrf = new Vrf(vrfName);
      @SuppressWarnings("unchecked")
      ArrayList<String> interfacesName = (ArrayList<String>) vrfMap.get("interfaces");
      SortedSet<String> interfaceNames = new TreeSet<>();
      for (int i = 0; i < interfacesName.size(); ++i) {
        String currentInterfaceName = interfacesName.get(i);
        /*if(currentInterfaceName.equals("MEth0/0/0")){
            continue;
        }*/
        interfaceNames.add(currentInterfaceName);
      }
      vrf.setInterfaceNames(interfaceNames);

      if (vrfMap.get("bgpProcess") != null) {
        BgpProcess bgpProcess = new BgpProcess();
        @SuppressWarnings("unchecked")
        Map<String, Object> bgpProcessMap = (Map<String, Object>) vrfMap.get("bgpProcess");
        // routerId
        Ip routerId = new Ip((String) bgpProcessMap.get("routerId"));
        BgpTieBreaker tieBreaker = BgpTieBreaker.valueOf((String) bgpProcessMap.get("tieBreaker"));
        boolean multipathEbgp = (Boolean) bgpProcessMap.get("multipathEbgp");
        boolean multipathIbgp = (Boolean) bgpProcessMap.get("multipathIbgp");
        MultipathEquivalentAsPathMatchMode multipathEquivalentAsPathMatchMode =
            MultipathEquivalentAsPathMatchMode.valueOf(
                (String) bgpProcessMap.get("multipathEquivalentAsPathMatchMode"));

        bgpProcess.setRouterId(routerId);
        bgpProcess.setTieBreaker(tieBreaker);
        bgpProcess.setMultipathEbgp(multipathEbgp);
        bgpProcess.setMultipathIbgp(multipathIbgp);
        bgpProcess.setMultipathEquivalentAsPathMatchMode(multipathEquivalentAsPathMatchMode);
        // neighbors
        @SuppressWarnings("unchecked")
        Map<Object, Object> neighborsMap = (Map<Object, Object>) bgpProcessMap.get("neighbors");
        SortedMap<Prefix, BgpActivePeerConfig> activePeerConfigMap = new TreeMap<>();
        for (Object neighborKey : neighborsMap.keySet()) {
          // prefix
          String prefixStr = (String) neighborKey;
          Prefix prefix = Prefix.parse(prefixStr);
          @SuppressWarnings("unchecked")
          Map<Object, Object> prefixMap = (Map<Object, Object>) neighborsMap.get(prefixStr);
          Boolean additionalPathsReceive = (Boolean) prefixMap.get("additionalPathsReceive");
          Boolean additionalPathsSelectAll = (Boolean) prefixMap.get("additionalPathsSelectAll");
          Boolean additionalPathsSend = (Boolean) prefixMap.get("additionalPathsSend");
          Boolean advertiseExternal = (Boolean) prefixMap.get("advertiseExternal");
          Boolean advertiseInactive = (Boolean) prefixMap.get("advertiseInactive");
          Boolean allowLocalAsIn = (Boolean) prefixMap.get("allowLocalAsIn");
          Boolean allowRemoteAsOut = (Boolean) prefixMap.get("allowRemoteAsOut");
          Long clusterId = ((Integer) prefixMap.get("clusterId")).longValue();
          int defaultMetric = (Integer) prefixMap.get("defaultMetric");
          Boolean ebgpMultihop = (Boolean) prefixMap.get("ebgpMultihop");
          Boolean enforceFirstAs = (Boolean) prefixMap.get("enforceFirstAs");
          String exportPolicy = (String) prefixMap.get("exportPolicy");
          String group = (String) prefixMap.get("group");
          Long localAs = ((Integer) prefixMap.get("localAs")).longValue();
          Ip localIp = new Ip((String) prefixMap.get("localIp"));
          Ip peerAddress = new Ip((String) prefixMap.get("peerAddress"));
          Long remoteAs = ((Integer) prefixMap.get("remoteAs")).longValue();
          Boolean routeReflectorClient = (Boolean) prefixMap.get("routeReflectorClient");
          Boolean sendCommunity = (Boolean) prefixMap.get("sendCommunity");

          // setters
          BgpActivePeerConfig.Builder builder = BgpActivePeerConfig.builder();
          builder.setAdditionalPathsReceive(additionalPathsReceive);
          builder.setAdditionalPathsSelectAll(additionalPathsSelectAll);
          builder.setAdditionalPathsSend(additionalPathsSend);
          builder.setAdvertiseExternal(advertiseExternal);
          builder.setAdvertiseInactive(advertiseInactive);
          builder.setAllowLocalAsIn(allowLocalAsIn);
          builder.setAllowRemoteAsOut(allowRemoteAsOut);
          builder.setClusterId(clusterId);
          builder.setDefaultMetric(defaultMetric);
          builder.setEbgpMultihop(ebgpMultihop);
          builder.setEnforceFirstAs(enforceFirstAs);
          builder.setExportPolicy(exportPolicy);
          builder.setGroup(group);
          builder.setLocalAs(localAs);
          builder.setLocalIp(localIp);
          builder.setPeerAddress(peerAddress);
          builder.setRemoteAs(remoteAs);
          builder.setRouteReflectorClient(routeReflectorClient);
          builder.setSendCommunity(sendCommunity);
          BgpActivePeerConfig bgpActivePeerConfig = builder.build();

          activePeerConfigMap.put(prefix, bgpActivePeerConfig);
        }
        bgpProcess.setNeighbors(activePeerConfigMap);
        vrf.setBgpProcess(bgpProcess);
      }

      if (vrfMap.get("ospfProcesses") != null) {
        @SuppressWarnings("unchecked")
        Map<Object, Object> ospfProcessesJsonMap =
            (Map<Object, Object>) vrfMap.get("ospfProcesses");
        Map<String, OspfProcess> ospfProcesses = new HashMap<>();
        for (Object o : ospfProcessesJsonMap.keySet()) {
          SortedMap<Long, OspfArea> areasMap = new TreeMap<>();
          String ospfProcessName = (String) o;
          @SuppressWarnings("unchecked")
          Map<Object, Object> ospfProcessMap =
              (Map<Object, Object>) ospfProcessesJsonMap.get(ospfProcessName);
          String exportPolicy = (String) ospfProcessMap.get("exportPolicy");
          String processId = (String) ospfProcessMap.get("processId");
          Double referenceBandwidth = (Double) ospfProcessMap.get("referenceBandwidth");
          boolean rfc1583Compatible = (boolean) ospfProcessMap.get("rfc1583Compatible");
          Ip routerId = new Ip((String) ospfProcessMap.get("routerId"));

          @SuppressWarnings("unchecked")
          Map<Object, Object> areasJsonMap = (Map<Object, Object>) ospfProcessMap.get("areas");
          for (Object o1 : areasJsonMap.keySet()) {
            String key = (String) o1;
            @SuppressWarnings("unchecked")
            Map<Object, Object> areaMap = (Map<Object, Object>) areasJsonMap.get(key);
            Long areaName = ((Integer) areaMap.get("name")).longValue();
            boolean injectDefaultRoute = (boolean) areaMap.get("injectDefaultRoute");
            @SuppressWarnings("unchecked")
            ArrayList<String> interfacesJson = (ArrayList<String>) areaMap.get("interfaces");
            SortedSet<String> interfaces = new TreeSet<>();
            for (int i = 0; i < interfacesJson.size(); i++) {
              interfaces.add(interfacesJson.get(i));
            }
            int metricOfDefaultRoute = (Integer) areaMap.get("metricOfDefaultRoute");
            StubType stubType = StubType.valueOf((String) areaMap.get("stubType"));
            // setters
            OspfArea.Builder builder = OspfArea.builder();

            builder.setInjectDefaultRoute(injectDefaultRoute);
            builder.setInterfaces(interfaces);
            builder.setMetricOfDefaultRoute(metricOfDefaultRoute);
            builder.setStubType(stubType);
            builder.setNumber(areaName);

            OspfArea ospfArea = builder.build();
            areasMap.put(areaName, ospfArea);
          }
          OspfProcess.Builder builder1 = OspfProcess.builder();
          builder1.setAreas(areasMap);
          builder1.setExportPolicyName(exportPolicy);
          builder1.setProcessId(processId);
          builder1.setReferenceBandwidth(referenceBandwidth);
          builder1.setRfc1583Compatible(rfc1583Compatible);
          builder1.setRouterId(routerId);

          OspfProcess ospfProcess = builder1.build();
          vrf.setOspfProcess(ospfProcess);
          break;
        }
//        vrf.setOspfProcess(ospfProcesses.values().iterator().next());
      }
      @SuppressWarnings("unchecked")
      ArrayList<Map<Object, Object>> tmpArray_2 =
          (ArrayList<Map<Object, Object>>) vrfMap.get("aggregateRoutes");
      if ((tmpArray_2).size() != 0) {
        @SuppressWarnings("unchecked")
        ArrayList<Map<Object, Object>> aggregateRoutes =
            (ArrayList<Map<Object, Object>>) vrfMap.get("aggregateRoutes");
        NavigableSet<GeneratedRoute> generatedRoutes = new TreeSet<>();
        for (int i = 0; i < aggregateRoutes.size(); i++) {
          Map<Object, Object> aggregateRouteMap = aggregateRoutes.get(i);
          Prefix network = Prefix.parse((String) aggregateRouteMap.get("network"));
          int administrativeCost = (Integer) aggregateRouteMap.get("administrativeCost");
          Ip netxHopIp = new Ip((String) aggregateRouteMap.get("nextHopIp"));
          boolean discard = (Boolean) aggregateRouteMap.get("discard");
          String generationPolicy = (String) aggregateRouteMap.get("generationPolicy");
          long metric = ((Integer) aggregateRouteMap.get("metric")).longValue();
          GeneratedRoute generatedRoute =
              GeneratedRoute.jsonCreator(
                  network,
                  administrativeCost,
                  netxHopIp,
                  null,
                  null,
                  null,
                  discard,
                  generationPolicy,
                  metric,
                  null);
          generatedRoutes.add(generatedRoute);
        }
        vrf.setGeneratedRoutes(generatedRoutes);
      }

      @SuppressWarnings("unchecked")
      ArrayList<Map<Object,Object>> staticRoutesMap = (ArrayList< Map<Object,Object> >)vrfMap.get("staticRoutes");
      SortedSet<StaticRoute> staticRoutes = new TreeSet<>();
      for(int i=0;i<staticRoutesMap.size();i++){
        Prefix network = Prefix.parse((String)staticRoutesMap.get(i).get("network"));
        Ip nextHop = new Ip((String)staticRoutesMap.get(i).get("nextHopIp"));
        String nextHopInterface = (String)staticRoutesMap.get(i).get("nextHopInterface");
        Integer administrativeCost = (Integer)staticRoutesMap.get(i).get("administrativeCost");
        long metric = ((Integer)staticRoutesMap.get(i).get("metric")).longValue();
        int tag = (Integer)staticRoutesMap.get(i).get("tag");
        StaticRoute.Builder builder = StaticRoute.builder();
        builder.setNetwork(network);
        builder.setNextHopIp(nextHop);
        builder.setNextHopInterface(nextHopInterface);
        builder.setAdministrativeCost(administrativeCost);
        builder.setMetric(metric);
        builder.setTag(tag);
        StaticRoute staticRoute = builder.build();
        staticRoutes.add(staticRoute);
      }
      vrf.setStaticRoutes(staticRoutes);

      vrfs.put(vrfName, vrf);
    }
    return vrfs;
  }
}
