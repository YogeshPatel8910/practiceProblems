import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean flag = true;

        while(flag){

//            System.out.println("Choose From Below");
//            System.out.println("Enter 1 for Prob1 : Program to check whether a given string is a palindrome.");
//            System.out.println("Enter 2 for Prob2 : Program to generate the first N terms of the Fibonacci sequence.");
//            System.out.println("Enter 3 for Prob3 : Program to check whether two given strings are anagrams of each other.");
//            System.out.println("Enter 4 for Prob4 : Write a program to check whether a given number is a palindrome.");
//            System.out.println("Enter 5 for Prob5 : Write a program to calculate the factorial of a given number.");
//            System.out.println("Enter 6 for Prob6 : Write a program to check whether a given number is prime or not.");
//            System.out.println("Enter 7 for Prob7 : Write a program to count the number of vowels and consonants in a given string.");
//            System.out.println("Enter 8 for Prob8 : Write a program to check if a given number is an Armstrong number.");
//            System.out.println("Enter 9 for Prob9 : Write a program to perform basic arithmetic operations (+, -, * , /) based on user input using a switch case.");
//            System.out.println("Enter 10 for Prob10 : Write a program to input three numbers and find the largest among them.");
//            System.out.println("Enter 11 for Prob11 : Write a program to check whether a given string is empty or null.");
//            System.out.println("Enter 12 for Prob12 : Write a program to implement a simple banking system with deposit, withdraw, and balance check features.");
//            System.out.println("Enter 13 for Prob13 : Write a program to check whether a given year is a leap year.");
//            System.out.println("Enter 14 for Prob14 : Write a program to find the second largest number in a given array of integers.");
//            System.out.println("Enter 15 for Prob15 : Write a program to find the longest word in a given sentence.");
//            System.out.println("Enter 16 for Prob16 : Write a program to display the current date in multiple formats.");
//            System.out.println("Enter 17 for Prob17 : Write a program to extract and separate digits and alphabets from a given string.");
//            System.out.println("Enter 18 for Prob18 : Write a Java program that determines the day of the week based on user input.\n " +
//                    "                     The program should provide the following options:1. Display the day of the week for today’s date.\n" +
//                    "                                                                       2. Allow the user to input a specific date (year, month, day) and display the corresponding day of the week.");
//            System.out.println("Enter 0 to Exit ");
            System.out.print("Enter your Selection : ");
            int i = sc.nextInt();
            switch(i) {
                case 0:
                    flag=false;
                    break;
                case 1:
                    Problem1.prob1();
                    break;
                case 2:
                    Problem2.prob2();
                    break;
                case 3:
                    Problem3.prob3();
                    break;
                case 4:
                    Problem4.prob4();
                    break;
                case 5:
                    Problem5.prob5();
                    break;
                case 6:
                    Problem6.prob6();
                    break;
                case 7:
                    Problem7.prob7();
                    break;
                case 8:
                    Problem8.prob8();
                    break;
                case 9:
                    Problem9.prob9();
                    break;
                case 10:
                    Problem10.prob10();
                    break;
                case 11:
                    Problem11.prob11();
                    break;
                case 12:
                    Problem12.prob12();
                    break;
                case 13:
                    Problem13.prob13();
                    break;
                case 14:
                    Problem14.prob14();
                    break;
                case 15:
                    Problem15.prob15();
                    break;
                case 16:
                    Problem16.prob16();
                    break;
                case 17:
                    Problem17.prob17();
                    break;
                case 18:
                    Problem18.prob18();;
                    break;
                default:
                    System.out.println("Enter Correct Selection");
            }
        }
    }

}