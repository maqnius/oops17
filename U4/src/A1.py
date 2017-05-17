"""
Aufgabe 1
"""


def rekursion(counter=0):
    """
    Calls itself until an error occurs.
    Prints the number of recursion-steps.
    
    Parameters
    ----------
    counter : int
        should not be set
    
    Returns
    -------
    None
    """
    error_occured = False
    counter += 1
    if not error_occured:
        try:
            rekursion(counter)
        except:
            end = True
            print("Nach {} Rekursionen ist die Rekursionstiefe erreicht".format(counter))


if __name__ == '__main__':
    rekursion()
