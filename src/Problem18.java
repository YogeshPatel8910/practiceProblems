import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Problem 18 Write a Java program that determines the day of the week based on user input.
 * The program should provide the following options:
 * 1. Display the day of the week for today’s date.
 * 2. Allow the user to input a specific date (year, month, day) and display the corresponding day of the week.
 */
public class Problem18 {
    public static void prob18(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date(dd-mm-yyyy) : ");
        String input = sc.next();
        LocalDate s = LocalDate.parse(input,DateTimeFormatter.ofPattern("d-M-yyy"));
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        System.out.println("Today's Day is "+date.format(formatter));
        System.out.println("Day of the inputted day is "+s.format(formatter));
    }
}
