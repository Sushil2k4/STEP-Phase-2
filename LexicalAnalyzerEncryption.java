Problem Statement

Write a Java program that acts as a simple lexical analyzer to encrypt a given paragraph of text.

Each character in the text must be converted into a numeric value using the following mapping rules:

Mapping Rules

Lowercase letters:
a = 1, b = 2, c = 3, ... , z = 26

Uppercase letters:
A = 27, B = 28, C = 29, ...

Space " " = 0

Full stop "." = 99

Tasks

Read the given paragraph of text.

Convert each character into its encrypted numeric value according to the mapping rules.

Display the encrypted numeric sequence.

Calculate and display the sum of all encrypted values.

Example

Input

COVID crisis

Output

29 41 48 35 30 0 3 18 9 19 9 19
Language

Java

  ***********************************************************************

 public class LexicalAnalyzer {
    public static void main(String[] args) {
        String text = "COVID crisis has taught us several lessons and together we have overcome this great challenge."
        + "The COVID pandemic sent shock waves through the world economy and triggered the largest global economic crisis in more than a century."
        + "The crisis led to a dramatic increase in inequality within and across countries."
        + "Preliminary evidence suggests that the recovery from the crisis will be as uneven as its initial economic impacts, with emerging economies and economically disadvantaged groups needing much more time to recover from pandemic-induced losses of income and livelihoods."
        + "Now there is a sense of introspection in people. India has emerged stronger";

        int sum = 0;
        System.out.println("The Encrypted statement is : ");

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int value = 0;

            if (ch >= 'a' && ch <= 'z') {
                value = ch - 'a' + 1;
            } else if ( ch >= 'A' && ch <= 'Z') {
                value = ch - 'A' + 27;
            } else if ( ch == ' ') {
                value  = 0;
            } else if ( ch == '.') {
                value = 99;
            } else {
                continue;
            }
            System.out.print(value + " ");
            sum += value;
        }
        System.out.println("\n");
        System.out.println("Sum of all encrypted numbers : " + sum);
    }
}

