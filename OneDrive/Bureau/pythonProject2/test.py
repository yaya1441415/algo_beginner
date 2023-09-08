def fibonacci_modulo(n, m):
    # Helper function to multiply two matrices
    def matrix_multiply(A, B):
        return [
            [(A[0][0] * B[0][0] + A[0][1] * B[1][0]) % m, (A[0][0] * B[0][1] + A[0][1] * B[1][1]) % m],
            [(A[1][0] * B[0][0] + A[1][1] * B[1][0]) % m, (A[1][0] * B[0][1] + A[1][1] * B[1][1]) % m]
        ]

    # Helper function to raise a matrix to the power n
    def matrix_power(matrix, power):
        result = [[1, 0], [0, 1]]
        while power > 0:
            if power % 2 == 1:
                result = matrix_multiply(result, matrix)
            matrix = matrix_multiply(matrix, matrix)
            power //= 2
        return result

    # Base case
    if n == 0:
        return 0

    # Initialize the Fibonacci matrix
    F = [[1, 1], [1, 0]]

    # Calculate F^n modulo m using matrix exponentiation
    result_matrix = matrix_power(F, n - 1)

    # The Fibonacci number F(n) is in the top left of the result matrix
    return result_matrix[0][0]

# Input
n, m = map(int, input().split())

# Output Fn mod m
print(fibonacci_modulo(n, m))
