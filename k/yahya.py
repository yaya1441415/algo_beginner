
def swap(a, i, j):
    assert 0 <= i < len(a), f'accessing index {i} beyond end of array {len(a)}..'
    assert 0 <= j < len(a), f'accessing index {j} beyond end of array {len(a)}..'
    a[i], a[j] = a[j], a[i]

def simplePartition(a, pivot):
    n = len(a)
    i = -1

    for j in range(n):
        if a[pivot] >a[j]:
            i += 1
            swap(a, i, j)

    swap(a, n-1, i + 1)
    return i + 1

def boundedSort(a, k):
    for j in range(1, 13):
        simplePartition(a, j)





a = [1, 3, 6, 1, 5, 4, 1, 1, 2, 3, 3, 1, 3, 5, 2, 2, 4]
boundedSort(a,len(a)-1)
