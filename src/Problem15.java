import java.util.Scanner;

/**
 * Problem 15 Write a program to find the longest word in a given sentence.
 */
public class Problem15 {
    public static void prob15(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int length = 0;
        String s = "";
        for(String word : words){
            if(length < word.length()){
                length = word.length();
                s = word;
            }
        }
        System.out.println("The longest word in the sentence is, "+s);
    }
}
