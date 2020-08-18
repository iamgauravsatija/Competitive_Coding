# cook your dish here
# Steps:
# 	1. Take the input
#	2. Use modulus to get the remainder
#	3. Do increment by 1 is divisible by 4 or decrement by 1 otherwise.

temp = int(input())
if (temp%4) == 0:
	print(temp+1)
else:
	print(temp-1)
