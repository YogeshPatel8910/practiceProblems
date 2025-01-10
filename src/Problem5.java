import java.util.Scanner;

/**
 * Problem 5 Write a program to calculate the factorial of a given number.
 */
public class Problem5 {
    public static void prob5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int temp=1;
        if(n==0 || n==1){
            System.out.println("Factorial of the given number is 1");
        }
        else{
            while(n>2){
                temp=temp*n;
                n--;
            }
            System.out.println("Factorial of the given number is "+temp);
        }
    }
}
