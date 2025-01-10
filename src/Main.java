import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean flag = true;

        while(flag){

            System.out.println("Choose From Below");
            System.out.println("Enter 1 for Prob1 : Program to check whether a given string is a palindrome.");
            System.out.println("Enter 2 for Prob2 : Program to generate the first N terms of the Fibonacci sequence.");
            System.out.println("Enter 3 for Prob3 : Program to check whether two given strings are anagrams of each other.");
            System.out.println("Enter 4 for Prob4 : Write a program to check whether a given number is a palindrome.");
            System.out.println("Enter 5 for Prob5 : Write a program to calculate the factorial of a given number.");
            System.out.println("Enter 6 for Prob6 : Write a program to check whether a given number is prime or not.");
            System.out.println("Enter 7 for Prob6 : Write a program to count the number of vowels and consonants in a given string.");
            System.out.println("Enter 8 for Prob6 : Write a program to check if a given number is an Armstrong number.");
            System.out.println("Enter 9 for Prob6 : Write a program to perform basic arithmetic operations (+, -, * , /) based on user input using a switch case.");
            System.out.println("Enter 0 to Exit ");
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
                default:
                    System.out.println("Enter Correct Selection");
            }
        }
    }

}