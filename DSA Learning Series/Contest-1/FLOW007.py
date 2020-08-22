test = int(input())

while test > 0:
	number = int(input())
	numberReverse = 0
	while number > 0:
		numberReverse = numberReverse*10 + number%10
		number = number//10
	print(numberReverse)
	test-=1
