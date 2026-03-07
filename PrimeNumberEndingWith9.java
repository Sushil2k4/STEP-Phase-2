/* Problem Statement

Write a Java program to generate all prime numbers between 1 and 10,000 that end with the digit 9.

The program should:

Identify numbers that are:

Prime numbers

Ending with digit 9

Display the results in ranges of 100 numbers:

0–99

100–199

200–299

...

9900–9999

For each range, display:

The range

The count of prime numbers ending with 9

The prime numbers themselves

Finally display the total count of such prime numbers between 1 and 10,000.

Concepts Used

Prime number checking

Loops

Modular programming

Range-based output formatting

  ********************************************************************************
*/

 public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean endsWith9(int num) {
        return (num % 10 == 9);
    }

    public static int displayingRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i) && endsWith9(i)) {
                count ++;
            }
        }
        System.out.println("Total number of prime numbers from " + start + " to " + end + " = " + count);
        for (int i = start; i <= end; i++) {
            if (isPrime(i) && endsWith9(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        return count;
    }

    public static void main(String[] args) {
        int totalCount = 0;
        for (int start = 0; start < 10000; start += 100) {
            int end = start + 99;
            totalCount += displayingRange(start, end);
        }
        System.out.println("Total prime numbers from 1 to 10,000 that end with the digit 9 : " + totalCount);
    }
}
