heartbeat = int(input("Insert your heartbeats per minute: "))
age = int(input("Insert your age: "))

if age < 2:
    if 120 <= heartbeat <= 140:
        print("You're healthy!")
    elif heartbeat < 120:
        print("Your heartbeats are too slow!")
    else:
        print("Your heartbeats are too high!")
elif 8 <= age <= 17:
    if 80 <= heartbeat <= 100:
        print("You're healthy!")
    elif heartbeat < 80:
        print("Your heartbeats are too slow!")
    else:
        print("Your heartbeats are too high!")
elif 20 <= age <= 50:
    if 70 <= heartbeat <= 80:
        print("You're healthy!")
    elif heartbeat < 70:
        print("Your heartbeats are too slow!")
    else:
        print("Your heartbeats are too high!")
elif age >= 60:
    if 50 <= heartbeat <= 60:
        print("You're healthy!")
    elif heartbeat < 50:
        print("Your heartbeats are too slow!")
    else:
        print("Your heartbeats are too high!")