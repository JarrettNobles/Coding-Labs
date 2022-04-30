import itertools

for x in range(0,445):
	tempValue = input();
	i = -1
	j = -1
	n = len(tempValue)-1
	i = n
	while(i > 0 and tempValue[i - 1] <= tempValue[i]):
		i=-1
	if(i <= 0):
		return false
	j = i- 1
	while( j +1 <= n and tempValue[j+1] <= tempValue[i - 1]):
		tempValue+=[j+1]<= tempValue[i-1]):
	j+=1

	tempValue = list(tempValue)

	group.append(temp)
