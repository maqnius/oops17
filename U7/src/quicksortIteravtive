r"""
Iterative Version of Quicksort

inspired by:
http://codexpi.com/quicksort-python-iterative-recursive-implementations/

"""
import random

def quicksortIterative(liste):
    #initialize left and right limiting indices to sort list
    left = 0
    right = len(liste)-1
    #holds limiting indeces of seperated sublists
    temp_stack = []
    temp_stack.append((left,right))

    # Main loop to pop and push items until stack is empty and list is sorted
    while temp_stack:
        pos = temp_stack.pop()
        right, left = pos[1], pos[0]
        #perform sorting of sublist
        piv_idx = partition(liste, left, right)
        # If there are items in the left of the pivot push them to the stack
        if piv_idx - 1 > left:
            temp_stack.append((left, piv_idx - 1))
        # If there are items in the right of the pivot push them to the stack
        if piv_idx + 1 < right:
            temp_stack.append((piv_idx + 1, right))


def partition(list_, left, right):
    """
    Partition method
    """
    # use the left item of the list as pivot
    piv = list_[left]
    i = left + 1
    j = right

    #loop over elements and exchange bigger and smaller elements
    while True:
        while i <= j and list_[i] <= piv:
            i += 1
        while j >= i and list_[j] >= piv:
            j -= 1
        if j <= i:
            break
        # Exchange items
        list_[i], list_[j] = list_[j], list_[i]
    # Exchange pivot to the rightest position of the left sublist
    list_[left], list_[j] = list_[j], list_[left]
    #return index of the pivot element
    return j

if __name__ == '__main__':
    #create random list of integer
    n = int(input("How many items shall be in your list?:\n"))

    list = [random.randint(0,30) for i in range(0,n)]
    print("your randomly created list:")
    print(list)
    quicksortIterative(list)
    print("your sorted list:")
    print(list)