def create_matrix(n, m):
    matrix = [[0]*m]*n
    return matrix

def fill_matr(matrix, size):
    n = len(matrix[0])
    last_elem = 0
    while last_elem < size:
        i = last_elem // n
        j = last_elem % n
        print("enter another element")
        print(i, j)
        new_elem = int(input())
        matrix[i][j] = new_elem
        print(matrix)
        last_elem += 1
    print("matrix is full")
    print(matrix)
    return matrix
    
    
def make_matrix():
    print("Create n*m Matrix")
    print("Enter matrix parameters:")
    print("n = ")
    n = int(input())
    print("m = ")
    m = int(input())
    size = n * m
    matrix = create_matrix(n, m)
    print(matrix)
    matrix = fill_matr(matrix, size)
    print(matrix)


def transpose_matrix(matrix):
    n = len(matrix)
    m = len(matrix[0])
    print(n, m)
    matrix_t = [[0] * n] * m
    print(matrix_t)
    for j in range(m):
        for i in range(n):
            matrix_t[j][i] = matrix[i][j]
    
    return matrix_t
    
    
    
matrix = [[1, 2, 3], [4, 5, 6]]
print(transpose_matrix(matrix))