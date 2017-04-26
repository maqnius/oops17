"""
Aufgabe 2
---------
Stefaan Hessmann
Mark Niehues
Jaap Pedersen

"""

# Definition of functions
# The end of the sum is given is passed as an argument

def sum_1(max):
    sum = 0

    for i in range(1, max+1):
        sum += i

    return sum

def sum_2(max):
    sum = 0

    for i in range(1, max+1):
        sum += 1/i

    return sum

def sum_3(max):
    sum = 0

    for i in range(1, max+1):
        sum += 1/i**2

    return sum

def sum_4(max):
    sum = 0

    for i in range(1, max+1):
        sum += 1 / fac(i)

    return sum

def fac(i):
    if i < 2:
        return 1

    faculty = 1

    for k in range(2, i+1):
        faculty *= k

    return faculty

# User interaction
sum_no = int(input("Which sum would you like to calculate? "
               "Choose a Number between 1 and 8:\n"))

# Process input
if sum_no == 1:
    print(sum_1(100))
elif sum_no == 2:
    print(sum_1(100000))
elif sum_no == 3:
    print(sum_2(100))
elif sum_no == 4:
    print(sum_2(100000))
elif sum_no == 5:
    print(sum_3(100))
elif sum_no == 6:
    print(sum_3(100000))
elif sum_no == 7:
    print(sum_4(20))
elif sum_no == 8:
    print(sum_4(1000))
else:
    print("Wrong input.")

