"""
Aufgabe 1
"""


def rekursion(counter=1, error_occured = False):
    """
    Calls itself until an error occurs.
    Prints the number of recursion-steps.
    
    Parameters
    ----------
    counter : int
        should not be set

    error_occured : boolean
		Determines if an error already occured
    
    Returns
    -------
    None
    """
    counter += 1
    if not error_occured:
        try:
            rekursion(counter)
        except:
            if not error_occured:
            	print("Nach {} Rekursionen ist die Rekursionstiefe erreicht".format(counter))
            	error_occured = True


if __name__ == '__main__':
    rekursion()
