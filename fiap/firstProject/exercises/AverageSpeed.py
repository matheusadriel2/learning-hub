print("This program calculates the average speed of a scooter")

distance = input("What was the distance in meters traveled by the scooter?")
time = input("How many minutes did the scooter take to travel this distance?")

average_speed = float(distance) / float(time)
print(f"The scooter beated a speed of {average_speed:.2f} m/min")