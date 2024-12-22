rm = input("Insert your RM: ")
age = input("Insert your age: ")

if int(age) >= 18:
    print("Authorized, student {}".format(rm))
    print("More information will be sent to your registered e-mail.")
else:
    authorized = input("Do you have authorization from those responsible? Y for YES or N for NO: ")
    if authorized == "Y":
        print("Authorized, student {}".format(rm))
        print("More information will be sent to your responsible e-mail.")
    else:
        print("Denied!")