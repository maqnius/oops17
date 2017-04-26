def calculate_product():
    print('perform a multiplication with a value greater than 0 or terminate the program with 0')
    x = int(input('Enter a number :'))
    #check initial value
    if x == 0:
        raise ValueError('number has to be different from zero')
    #set y=1 to enter while loop
    y = 1
    while y!= 0:
        y = int(input('Enter a number greater or equal zero:'))
        if y<0:
            print('number has to be greater or equal zero')
            y = int(input('Enter a number greater or equal zero'))
        elif y != 0:
            x*= y
            print(x)
        else:
            break

    print('result of the product of all inserted number is: ',x)
    return x