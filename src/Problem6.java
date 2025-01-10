import java.util.Scanner;

/**
 * Problem 6 Write a program to check whether a given number is prime or not.
 */
public class Problem6 {
    public static void prob6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Not a Prime Number");
            return;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("Not a Prime Number");
                    return;
                }
            }
            System.out.println("Is a Prime Number");
        }
    }
}
