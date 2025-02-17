costs = 0
spent = 0

while costs < 1000:
    spent = int(input("Insert the spent value: "))
    costs = costs + spent
    
print(costs)