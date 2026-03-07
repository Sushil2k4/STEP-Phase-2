Problem Statement

A number is called a Special Number if the sum of its digits raised to the power of their respective positions (starting from 1 from the left) is equal to the number itself.

For a number with digits:

d₁ d₂ d₃ ... dₖ

The number is Special if:

d₁¹ + d₂² + d₃³ + ... + dₖᵏ = n

Example

Input:
135

Explanation:
1¹ + 3² + 5³ = 1 + 9 + 125 = 135

Output:
Special Number

Task

Write a Java program to:

Identify all Special Numbers between 1 and 10,000

Display all such numbers

Print the total count of Special Numbers found

Constraints

1 ≤ n ≤ 10,000

Position counting starts from the leftmost digit

Zero digits contribute 0^position = 0
