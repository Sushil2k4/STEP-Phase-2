/* Problem Statement

Write a Java program to analyze the daily sales of a company called Super Wheels using a derived mathematical formula.

The program should:

Calculate the daily sales using a formula.

Identify whether a given day is a corporate day.

Display the sales analysis for different days.

Requirements

Use functions for calculations.

Implement logic to determine corporate days.

Follow a modular programming approach.

Concepts Used

Functions / Methods

Conditional statements

Mathematical computation

  ********************************************************************************************************
 */

  import java.util.*;

public class SuperWheelSalesAnalysis {

    public static int dailySales(int day) {
        return (day * day - day + 1);
    }
    public static boolean isCorporateDay(int day) {
        return (day % 5 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[] months = {"April", "May", "June", "July", "August", "September"};
        int[] daysOfMonth = {30,31,30,31,31,30};
        int[] monthlySales = new int[6];
        int retailTotal = 0;
        int corporateTotal = 0;
        int dayCount = 1;
        for (int month = 0; month < 6; month ++) {
            for (int days = 1; days <= daysOfMonth[month]; days++) {
                int sales = dailySales(dayCount);
                monthlySales[month] += sales;
                if (isCorporateDay(dayCount)) {
                    corporateTotal += sales;
                } else {
                    retailTotal += sales;
                }
                dayCount++;
            }
        }
        System.out.println("Total vehicles sold per month :");
        for (int month = 0; month < 6; month++) {
            System.out.println(months[month] + " generated : " + monthlySales[month]);
        }
        System.out.println("\n");
        System.out.println("Cumulative sales by customer type");
        System.out.println("Total Retail sales :" + retailTotal);
        System.out.println("Total Corporate sales : " + corporateTotal);
        System.out.println("\n");
        System.out.println("Total Sales :" + (retailTotal + corporateTotal));
    }
}

Enhancement : Print the sales from July 15 to September 15 


import java.util.*;

public class SuperWheelSalesAnalysis {

    public static int dailySales(int day) {
        return (day * day - day + 1);
    }
    public static boolean isCorporateDay(int day) {
        return (day % 5 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[] months = {"April", "May", "June", "July", "August", "September"};
        int[] daysOfMonth = {30,31,30,31,31,30};
        int[] monthlySales = new int[6];
        int retailTotal = 0;
        int corporateTotal = 0;
        int dayCount = 1;
        int midPeriodSales = 0;
        for (int month = 0; month < 6; month ++) {
            for (int days = 1; days <= daysOfMonth[month]; days++) {
                int sales = dailySales(dayCount);
                monthlySales[month] += sales;
                if (isCorporateDay(dayCount)) {
                    corporateTotal += sales;
                } else {
                    retailTotal += sales;
                }
                if ((month == 3 && days >= 15) || (month == 4) || (month == 5 && days <= 15)) {
                    midPeriodSales += sales;
                }
                dayCount++;
            }
        }
        System.out.println("Total vehicles sold per month :");
        for (int month = 0; month < 6; month++) {
            System.out.println(months[month] + " generated : " + monthlySales[month]);
        }
        System.out.println("\n");
        System.out.println("Cumulative sales by customer type");
        System.out.println("Total Retail sales :" + retailTotal);
        System.out.println("Total Corporate sales : " + corporateTotal);
        System.out.println("\n");
        System.out.println("Total Sales :" + (retailTotal + corporateTotal));
        System.out.println("\n");
        System.out.println("Total Number of Sales between July 15 and September 15 : " + midPeriodSales);
    }
}






