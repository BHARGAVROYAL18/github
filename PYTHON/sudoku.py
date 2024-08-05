def solve_problem(description, data):
    # Mapping problem descriptions to functions
    def sum_of_squares(numbers):
        return sum(x**2 for x in numbers if x > 0)
    
    def find_maximum(numbers):
        return max(numbers) if numbers else None

    def reverse_string(s):
        return s[::-1]
    
    problem_solvers = {
        "sum of squares of positive numbers": sum_of_squares,
        "find maximum number": find_maximum,
        "reverse string": reverse_string
    }
    
    # Get the appropriate function based on the description
    solver_function = problem_solvers.get(description)
    
    if solver_function:
        # Call the function with the provided data
        return solver_function(data)
    else:
        return "Problem description not recognized."

# Example usage
description1 = "sum of squares of positive numbers"
data1 = [1, -2, 3, -4, 5]
print(f"Result: {solve_problem(description1, data1)}")

description2 = "find maximum number"
data2 = [10, 2, 34, 7]
print(f"Result: {solve_problem(description2, data2)}")

description3 = "reverse string"
data3 = "hello"
print(f"Result: {solve_problem(description3, data3)}")