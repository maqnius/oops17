print('perform a multiplication with a value greater than 0 or terminate the program with 0')
x = int(input('Enter a number :'))
#check initial value
if x == 0:
    raise ValueError('number has to be different from zero')
#set y=1 to enter while loop
y = 1
while y!= 0:
    y = int(input('Enter a number, to terminate enter zero:'))
    if y<0:
        x *= y
    elif y > 0:
        x *= y
        print(x)
    else:
        break

print('result of the product of all inserted number is: ',x)