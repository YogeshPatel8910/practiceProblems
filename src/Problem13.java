import java.util.Scanner;

/**
 * TProblem 13 Write a program to check whether a given year is a leap year.
 */
public class Problem13 {
    public static void prob13(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Year :");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0 && year%400!=0)
                System.out.println(year+" is not a Leap Year");
            else
                System.out.println(year+" is a Leap Year");
        }else
            System.out.println(year+" is not a Leap Year");
    }
}
