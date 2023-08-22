
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



print(a)
simplePartition(a, 1)
print(a)
assert(a[:5] == [1,1,1,1,1]),

simplePartition(a, 2)
print(a)
assert(a[:5] == [1,1,1,1,1]), 'Simple partition test 2(A) failed'
assert(a[5:8] == [2,2,2]), 'Simple Partition test 2(B) failed'


simplePartition(a, 3)
print(a)
assert(a[:5] == [1,1,1,1,1]), 'Simple partition test 3(A) failed'
assert(a[5:8] == [2,2,2]), 'Simple Partition test 3(B) failed'
assert(a[8:12] == [3,3,3,3]), 'Simple Partition test 3(C) failed'

simplePartition(a, 4)
print(a)
assert(a[:5] == [1,1,1,1,1]), 'Simple partition test 4(A) failed'
assert(a[5:8] == [2,2,2]), 'Simple Partition test 4(B) failed'
assert(a[8:12] == [3,3,3,3]), 'Simple Partition test 4(C) failed'
assert(a[12:14]==[4,4]), 'Simple Partition test 4(D) failed'

simplePartition(a, 5)
print(a)
assert(a == [1]*5+[2]*3+[3]*4+[4]*2+[5]*2+[6]), 'Simple Parition test 5 failed'

print('Passed all tests : 10 points!!!!')
