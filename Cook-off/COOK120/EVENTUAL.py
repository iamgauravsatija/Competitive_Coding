testCases = int(input())
inputString = ""

charData = [0] * 26

while testCases > 0:
	testCases-=1
	stringLength = int(input())
	string = input()
	flag = True
	
	if stringLength%2 != 0: 
		flag = False
	else:
		for i in range(0,25):
			charData[i] = 0
		
		for i in range(0, stringLength):
			charData[ord(string[i])-97]+=1
			i+=1

		for i in range (0,25):
			if charData[i]%2 != 0:
				flag = False
				i = 26

	if flag == False:
		print("NO")
	else:
		print("YES")


"https://www.codechef.com/viewsolution/37064401"