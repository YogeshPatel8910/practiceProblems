import java.util.Scanner;

/**
 * Problem 4 Write a program to check whether a given number is a palindrome.
 */
public class Problem4 {
    public static void prob4(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int temp = n;
        int rev=0;

        while(temp>0){
            rev+=temp%10;
            rev=rev*10;
            temp=temp/10;
        }
        if(n==rev/10)
            System.out.println("Is a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
