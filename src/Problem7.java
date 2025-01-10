import java.util.Scanner;

/**
 * Problem 7 Write a program to count the number of vowels and consonants in a given string
 */
public class Problem7 {
    public static void prob7() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String");
        String s = sc.next();
        int v = 0;
        int c = 0;
        for(char i : s.toLowerCase().toCharArray()){
            int ascii = i;
            if(ascii>96 && ascii<123){
                if(ascii==97 || ascii==101 || ascii==105 || ascii==111 || ascii==117)
                    v++;
                else
                    c++;
            }
        }
        System.out.println("No. of Vowels is "+v+"  No. of Consonent is "+c);
    }
}
