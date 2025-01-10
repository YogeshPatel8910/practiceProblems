import java.util.Scanner;

/**
 * Problem 8 Write a program to check if a given number is an Armstrong number.
 */
public class Problem8 {
    public static void prob8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        int temp = n;
        int a = 0;
        while(temp>0){
            a += (int) Math.pow(temp%10,3);
            temp/=10;
        }
        if(a==n)
            System.out.println("Is a Armstrong");
        else
            System.out.println("Not a Armstrong");
    }
}
