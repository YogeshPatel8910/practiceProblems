import java.util.Scanner;

/**
 * Problem 17 Write a program to extract and separate digits and alphabets from a given string.
 */
public class Problem17 {
    public static void prob17(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String :");
        String input = sc.next();
        StringBuilder digit = new StringBuilder();
        StringBuilder alpha = new StringBuilder();
        for(Character i : input.toCharArray()){
            if(Character.isDigit(i)){
                digit.append(i);
            }else if(Character.isAlphabetic(i)){
                alpha.append(i);
            }
        }
        System.out.println("Digits : "+digit);
        System.out.println("Alphabets : "+alpha);

    }
}
