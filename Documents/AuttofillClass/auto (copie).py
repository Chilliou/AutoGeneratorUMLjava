import os
import fnmatch
import re

def getVisibility(line):
	cRet='+'
	if 'private' in line:
		cRet = '-'
	if 'protected' in line:
		cRet = '#'
	return cRet

def deleteTabWhitespace(lstLine):
	bOK = False
	i = 0
	while i < len(lstLine):
		if re.search('^(private)|(public)|(protected).class.*',lstLine[i]):
			bOK = True
		while bOK or '{' in lstLine[i]:
			lstLine.remove(lstLine[i])
			print(lstLine[i])
			i+=1
			bOK = '}' in lstLine[i]
		i+=1



#def getAttribut(lstLine):
#	for line in lstLine:
#		if re.search('^(private)|(public)|(protected).*.(;)$',line):



	

entries = os.listdir('./')
lstFile = fnmatch.filter(entries, '*.java')
lstFile = [line[:-5] for line in lstFile]
for file in lstFile:
	print(file)

file = open(lstFile[2]+'.java', 'r')
lstTest = [line for line in file]
deleteTabWhitespace(lstTest)



input()