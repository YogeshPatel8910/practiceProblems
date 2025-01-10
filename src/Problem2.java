import java.util.Scanner;

/**
 * Problem 2 Program to generate the first N terms of the Fibonacci sequence.
 */
public class Problem2 {
    public static void prob2(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Length : ");
        int n = sc.nextInt();
        long n1 = 0;
        long n2 = 1;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for(int i = n-2 ; i > 0 ; i--){
            long temp = n1+n2;
            n1=n2;
            n2=temp;
            System.out.print(temp+" ");
        }
        System.out.println();
    }
}
