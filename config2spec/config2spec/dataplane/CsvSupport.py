# load csv file & output dict as csv
# loadCsv(csvName): -input: csv file name -output: dict (fromat like data frame)
# dictToCsv(dict, fileName): -input: aim dict & output file name -output: null

def loadCsv(csvName):
    retDict = {}
    # {
    #   attrName: [vars, ...],
    #   attrName: [vars, ...],
    #   ...
    # }

    csvFile = open(csvName, 'r')
    csvLines = csvFile.readlines()

    firstLine = True
    attrNames = []
    for csvLine in csvLines:
        csvLine = csvLine.replace('\n', '')
        if firstLine:  # load attrNames
            firstLine = False
            attrNames = csvLine.split(',')
            for attrName in attrNames:
                retDict[attrName] = []
        else:  # load attrs
            attrs = csvLine.split(',')
            for i in range(len(attrNames)):
                retDict[attrNames[i]].append(attrs[i])

    return retDict


def dictToCsv(dict, fileName):
    outputFile = open(fileName, 'w')
    attrNames = []
    outputString = ''
    firstLine = ''
    anyAttr = ''
    for attrName in dict.keys():
        anyAttr = attrName
        attrNames.append(attrName)
        if firstLine == '':
            firstLine += attrName
        else:
            firstLine += ',' + attrName
    outputString += firstLine + '\n'  # add a line
    for lineNum in range(len(dict[anyAttr])):
        currentLine = ''
        for attrName in attrNames:
            if currentLine == '':
                currentLine += dict[attrName][lineNum]
            else:
                currentLine += ',' + dict[attrName][lineNum]
        outputString += currentLine + '\n'  # add a line

    outputFile.write(outputString)
    outputFile.close()


if __name__ == '__main__':
    # for test
    dict = loadCsv('c2s_rs.csv')
    for attrName in dict.keys():
        print(dict[attrName][43365])
    dictToCsv(dict, 'testOutput.csv')
