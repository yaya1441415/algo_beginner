#Huge Fibonacci Number Problem
#Compute the n-th Fibonacci number modulo m.
#Input: Integers n and m.
#Output: n-th Fibonacci number
#modulo m.
def matrix_multiply(A, k,n):
    a, b, c, d = A
    x, y, z, w = k

# multiply 2 matrices.
    return (
        (a*x+b*z)%n,
        (a*y+b*w)%n,
        (c*x+d*z)%n,
        (c*y+d*w)%n,
    )

def matrixPower(A, m, k):
    if m == 0:
        return [1, 0, 0, 1]
    elif m == 1:
        return A
    else:
        B = A
        n = 2
        while n <= m:
            B = matrix_multiply(B, B,k)
            n = n*2
        R = matrixPower(A, m-n//2, k)
        return matrix_multiply(B, R, k)

#the function calculates the fibinocci number
# using matrix exponantiation.
#F(n)= [1,1,1,0] to the power of (n-1).
F = [1,1,1,0]
def fast_fib(n, m):
    return matrixPower(F, n, m)


if __name__ == '__main__':
    n, m = map(int, input().split())
    print(fast_fib(n, m)[1]%m)
