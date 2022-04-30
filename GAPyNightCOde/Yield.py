def testgen(index):
	weekdays = ['sun','mon','tue','wed','thu','fri','sat']
	yield weekdays[index]
	yield weekdays[index + 1]
day = testgen(3)
print(next(day), next(day))


