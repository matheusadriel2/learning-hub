points = int(input("Insert the client's points quantity: "))
if points >= 1000:
  print("The client receives plus 3GB!")
elif points >= 500:
  print("The client receives plus 1,5GB!")
elif points >= 200:
  print("The client receives plus 500MB!")
else:
  print("The client don't receive extra data.")