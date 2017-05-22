"""
Aufgabe 2
Hessmann, Niehues, Pedersen

Demonstrates the Towers of Hanoi using a recursive algorithm.

Similar to solution:
http://www.python-kurs.eu/tuerme_von_hanoi.php
"""

def hanoi(n, source, helper, target, rekursionstiefe = 0):
    if n > 0:
        # move tower of size n - 1 to helper:
        hanoi(n - 1, source, target, helper, rekursionstiefe = rekursionstiefe + 1)
        
        # move disk from source peg to target peg
        if source[0]:
            print("Moving {} from {} to {}".format(source[0][-1], source[1], target[1]))
            target[0].append(source[0].pop())

            # Parameters need to be seperated for printing
            afg = ""
            hlp = ""
            zl = ""
            for i in [source, target, helper]:
                if i[1] == "Anfang":
                    afg = i
                elif i[1] == "Ziel":
                    zl = i
                elif i[1] == "Hilfsstab":
                    hlp = i
            print("{}: {}\t {}: {}\t {}: {}".format(afg[1], afg[0], hlp[1], hlp[0], zl[1], zl[0]))

        # move tower of size n-1 from helper to target
        hanoi(n - 1, helper, source, target, rekursionstiefe = rekursionstiefe + 1)


if __name__ == '__main__':
    n = int(input("How many discs?:\n"))

    source = list(range(1,n+1)) # Creates list from 1 to n
    source = (source[::-1], "Anfang")       # Invertes the order
    target = ([], "Ziel")
    helper = ([], "Hilfsstab")
    hanoi(n,source,helper,target)