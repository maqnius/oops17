def colatz(n):
    """
    A2:
    compute the colatz-sequence starting with n

    Parameters
    ----------
    n : int
        colatz-sequence

    Returns
    -------
    list of int
        colatz-sequence
    int
        length of the colatz-sequence
    """
    colatz_sequence = [n]
    while n != 1:
        if n % 2 == 0:
            n = int(n / 2)
        else:
            n = 3 * n + 1
        colatz_sequence.append(n)
        print(n)
    return "Colatz-Folge: {}; Länge der Colatz-Folge: {}".format(colatz_sequence, len(colatz_sequence))





