import java.util.Scanner;

/**
 * Problem 1 Write a program to check whether a given string is a palindrome.
 */
public class Problem1 {
    public static void prob1() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s =sc.next();
        int first = 0;
        int last = s.length()-1;
        while(first<=last){
            if(s.charAt(first)==s.charAt(last)){
                first++;
                last--;
                continue;
            }
            System.out.println("Not a Palindrome");
            return;

        }
        System.out.println("Is a Palindrome");
    }
}
