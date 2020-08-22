listCoins = {}
for i in list(range(12)):
	listCoins[i] = i

def getCoins (n):
	if n in listCoins:
		return listCoins[n]
	else:
		listCoins[n] = ( getCoins(n//2) + getCoins(n//3) + getCoins(n//4))
		return listCoins[n]

while True:
	try:	
		inp = int(input())
		print(getCoins(inp))
	except:
		break
