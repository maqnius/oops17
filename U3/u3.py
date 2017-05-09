def modulo(x, y):
    """
    A1:
    compute x modulo y

    Parameters
    ----------
    x : int or float
    y : int

    Returns
    -------
    int or float
        x modulo y
    """
    while x - y >= 0:
        x -= y
    return x

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


def make_matrix(n, m):
    size = n * m
    print("please insert {} numbers, seperated by a comma".format(size))
    input_data = input()
    input_list = input_data.split()
    if len(input_list) != size:
        print("need {} numbers, not {}".format(size, len(input_list)))
    else:
        for i in input_list:


make_matrix(3, 5)