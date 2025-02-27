import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Problem 16 "Enter 16 for Prob15 : Write a program to display the current date in multiple formats.
 */
public class Problem16 {
    public static void prob16(){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("d-M-yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMM d yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("MMM d yy");
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("MMMM d yyyy");
        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("W");
        System.out.println(date.format(format1));
        System.out.println(date.format(format2));
        System.out.println(date.format(format3));
        System.out.println(date.format(format4));
        System.out.println(date.format(format5));
        System.out.println("Week of the month "+date.format(format6));

    }
}
