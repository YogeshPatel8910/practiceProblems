import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem 3 Program to check whether two given strings are anagrams of each other.
 */
public class Problem3 {
    public static void prob3(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String1 : ");
        String s1 = sc.next();
        System.out.print("Enter a String2 : ");
        String s2 = sc.next();
        if(s1.length()!=s2.length()){
            System.out.println("Not a Anagram");
            return;
        }
        Map<Character,Integer> m1  = new HashMap<>();
        for(char i : s1.toCharArray()){
            if(m1.containsKey(i))
                m1.put(i,m1.get(i)+1);
            else
                m1.put(i,1);
        }
        Map<Character,Integer> m2  = new HashMap<>();
        for(char i : s2.toCharArray()){
            if(m2.containsKey(i))
                m2.put(i,m2.get(i)+1);
            else
                m2.put(i,1);
        }
        if(m1.equals(m2))
            System.out.println("Is an Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
