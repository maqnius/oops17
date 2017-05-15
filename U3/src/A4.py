def create_matrix(n, m):
    """
    Create an empty n * m matrix
    
    Parameters
    ----------
    n : int
    m : int
    
    Returns
    -------
    matrix : list of lists
    
    """
    matrix = [[None]*m]*n
    return matrix

def fill_matr(matrix, size):
    """
    Fill an empty matrix with inputs.
    
    Parametres
    ----------
    matrix : list of lists
        empty matrix
    size : int
        size of the matrix
    
    Retruns
    -------
    matrix : list of lists
        matrix filled with values
    
    """
    n = len(matrix[0])
    last_elem = 0
    while last_elem < size:
        i = last_elem // n
        j = last_elem % n
        print("enter another element")
        new_elem = int(input())
        matrix[i][j] = new_elem
        print(matrix)
        last_elem += 1
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
    size = n * m
    matrix = create_matrix(n, m)
    matrix = fill_matr(matrix, size)
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
    n = len(matrix)
    m = len(matrix[0])
    matrix_t = [[None] * n] * m
    for j in range(m):
        for i in range(n):
            print(matrix[i][j])
            matrix_t[j][i] = matrix[i][j]
    
    return matrix_t
    
    

if __name__ == '__main__':
    # Aufgabe a)
    matrix = make_matrix()
    # Aufgabe b)
    print(matrix)
    # Aufgabe c)
    matrix_t = transpose_matrix(matrix)
    print(matrix_t)