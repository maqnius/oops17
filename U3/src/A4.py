def create_matrix(n, m):
    """
    Create an empty n * m matrix
    
    Parameters
    ----------
    n : int
        Rows
    m : int
        Columns
    
    Returns
    -------
    matrix : list of lists
    
    """
    matrix = [[None]*m for i in range(n)]
    return matrix


def fill_matr(matrix):
    """
    Fill an empty matrix with inputs.
    
    Parametres
    ----------
    matrix : list of lists
        empty matrix
    
    Retruns
    -------
    matrix : list of lists
        matrix filled with values
    
    """
    for j in range(len(matrix)):
        for i in range(len(matrix[0])):
            print("enter another element")
            matrix[j][i] = int(input()) 
    print("matrix is full")
    return matrix
    
    
def make_matrix():
    """
    Create a matrix. Size and elements are set by user via input().
    
    Parameters
    ----------
    None
    
    Returns
    -------
    matrix : list of lists
        matrix with values
    
    """
    print("Create n*m Matrix")
    print("Enter matrix parameters:")
    print("n = ")
    n = int(input())
    print("m = ")
    m = int(input())
    matrix = create_matrix(n, m)
    matrix = fill_matr(matrix)
    return matrix


def transpose_matrix(matrix):
    """
    Transpose a give n * m matrix.
    
    Parameters
    ----------
    matrix : list of lists
        matrix that will be transposed
    
    Returns
    -------
    matrix_t : list of lists
        transposed matrix
    
    """
    n = len(matrix[0])
    m = len(matrix)
    matrix_t = create_matrix(n,m)
    for j in range(n):
        for i in range(m):
            matrix_t[j][i] = matrix[i][j]
    
    return matrix_t


def print_matrix(matrix):
    """
    Prints a 2D List in a simple tab seperated way

    Parameters
    ----------
    matrix : list of lists
        matrix to be printed
    """
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            print(matrix[i][j], end='\t')
        print('')


if __name__ == '__main__':
    # Aufgabe a)
    matrix = make_matrix()
    # Aufgabe b)
    print("Gefüllte Matrix:")
    print_matrix(matrix)
    # Aufgabe c)
    print("Transponierte matrix:")
    matrix_t = transpose_matrix(matrix)
    print_matrix(matrix_t)