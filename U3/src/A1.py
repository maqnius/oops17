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