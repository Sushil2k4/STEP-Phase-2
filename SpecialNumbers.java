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

  ****************************************************************************

  public class SpecialNumber {
    public static boolean isSpecial(int n) {
        String numStr = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            int position = i+1;
            sum += Math.pow(digit, position);
        }
        return (sum == n);
    }

    public static void main(String[] args) {
        int count = 0;
        System.out.println("The Special Numbers between 1 and 10,000 : ");
        for (int i = 0; i < 10000; i++) {
            if (isSpecial(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("THE TOTAL COUNT OF SPECIAL NUMBERS FOUND " + count);
    }
}

