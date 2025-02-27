import java.util.Scanner;

/**
 * Problem 10 Write a program to input three numbers and find the largest among them.
 */
public class Problem10 {
    public static void prob10(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no. :");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd no. :");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd no. :");
        int c = sc.nextInt();
        if(a>b){
            if(a>c)
                System.out.println("1st no. is the Largest");
            else
                System.out.println("3rd no. is the Largest");
        }
        else{
            if(b>c)
                System.out.println("2nd no. is the Largest");
            else
                System.out.println("3rd no. is the Largest");
        }
    }
}
