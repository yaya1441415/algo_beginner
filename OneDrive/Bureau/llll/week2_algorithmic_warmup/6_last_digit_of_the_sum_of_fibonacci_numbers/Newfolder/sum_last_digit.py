def matrix_multiply(A, k):
    a, b, c, d = A
    x, y, z, w = k


    return (
        (a*x+b*z)%10,
        (a*y+b*w)%10,
        (c*x+d*z)%10,
        (c*y+d*w)%10,
    )

def matrixPower(A, m):
    if m == 0:
        return [1, 0, 0, 1]
    elif m == 1:
        return A
    else:
        B = A
        n = 2
        while n <= m:
            B = matrix_multiply(B, B)
            n = n*2
        R = matrixPower(A, m-n//2)
        return matrix_multiply(B, R)

F = [1,1,1,0]
def fast_fib(n):
    if n<=1:
        return n
    n-=1
    return matrixPower(F, n)[0]


if __name__ == '__main__':
    n = int(input())
    su=0
    for i in range(n+1):
        su+=fast_fib(i)%10

    print(su%10)