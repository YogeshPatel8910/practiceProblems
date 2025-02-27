import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem 14 Write a program to find the second largest number in a given array of integers.
 */
public class Problem14 {
    public static void prob14(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter space separated integer(Enter s at the end of input) : ");
        List<Integer> a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(s.equals("s"))
                break;
            int number = Integer.parseInt(s);
            a.add(number);
        }
        int big1=0;
        int big2=0;
        for(int i : a){
            if(big1<i){
                big2=big1;
                big1=i;
            }
            else if(big2<i){
                big2=i;
            }
        }
        System.out.println("Second Biggest number is : "+big2);
    }
}
