average = 6

match average:
    case average if average < 5:
        print("Failed")
    case average if average < 7:
        print("Retake")
    case average if average >= 8:
        print("Approved")