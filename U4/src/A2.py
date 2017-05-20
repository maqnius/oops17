"""
http://www.python-kurs.eu/tuerme_von_hanoi.php
"""

def hanoi(n, source, helper, target):
    if n > 0:
        # Put thie print so somewhere, where it makes sense!
        print("Tower 1: {} \t Tower 2: {} \t Tower 3: {}".format(source, helper, target))
        # move tower of size n - 1 to helper:
        hanoi(n - 1, source, target, helper)
        # move disk from source peg to target peg
        if source:
            target.append(source.pop())
        # move tower of size n-1 from helper to target
        hanoi(n - 1, helper, source, target)
        
n = int(input("How many discs?:\n"))

source = list(range(1,n+1)) # Creates list from 1 to n
source = source[::-1]       # Invertes the order

target = []
helper = []
hanoi(n,source,helper,target)