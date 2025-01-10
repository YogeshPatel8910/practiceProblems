import java.util.Scanner;

/**
 * Problem 9 Write a program to perform basic arithmetic operations (+, -, * , /) based on user input using a switch case.
 */
public class Problem9 {
    public static void prob9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int first = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int second = sc.nextInt();
        System.out.print("Enter the Operation to perform(+,-,*,/) : ");
        String operation = sc.next();
        switch (operation){
            case "+":
                System.out.println("Output : "+(first+second));
                break;
            case "-":
                System.out.println("Output : "+(first-second));
                break;
            case "*":
                System.out.println("Output : "+(first*second));
                break;
            case "/":
                if(second==0)
                    System.out.println("Invalid expression");
                else
                    System.out.println("Output : "+(first/second));
                break;
        }
    }
}
