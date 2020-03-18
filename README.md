Description:
The console application “Calculator”.
The application read arithmetic operations entered by the user from the console and output the result of their execution to the console.

Requirements:
The calculator can perform addition, subtraction, multiplication and division operations with two numbers: a + b, a - b, a * b, a / b. Data is transmitted in one line (see example)! Decisions in which each number and arithmetic operation are transferred from a new line are considered incorrect.
The calculator can work with both Arabic (1,2,3,4,5 ...) and Roman (I, II, III, IV, V ...) numbers.
The calculator must accept numbers from 1 to 10 inclusive, no more. At the output, the numbers are not limited in size and can be any.
The calculator can only work with integers.
The calculator can only work with Arabic or Roman numerals at the same time, when a user enters a string like 3 + II, the calculator should throw an exception and stop its work.
When the user enters unsuitable numbers, the application throws an exception and terminates.
When a user enters a string that does not correspond to one of the above arithmetic operations, the application throws an exception and terminates.
An example of the program:
Input:
1 + 2

Output:
3

Input:
VI / III

Output:
II
