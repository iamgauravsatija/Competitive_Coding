test_cases = int(input())

while test_cases > 0 :
	test_cases -= 1
	lst = list(map(int,input().strip().split()))[:2]
	pc = int(lst[0])
	pr = int(lst[1])

	# pc is for final power of Chef  & pr is for final power of Rick
	dc = int(pc/9)	  # dc is for digits required by Chef
	dr = int(pr/9)	  # dr is for digits required by Rick
	if pc%9 != 0:
		dc += 1
	if pr%9 != 0:
		dr += 1
	if dc < dr:
		print(0, dc)
	else:
		print(1, dr)


# https://www.codechef.com/viewsolution/37045370