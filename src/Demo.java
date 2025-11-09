import java.time.LocalDate;
import java.util.Scanner;

    public class Demo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter day: ");
            int day = sc.nextInt();

            System.out.print("Enter month: ");
            int month = sc.nextInt();

            System.out.print("Enter year: ");
            int year = sc.nextInt();


            LocalDate date = LocalDate.of(year, month, day);

            // Print the day of week in proper format
            String dayName = date.getDayOfWeek().toString().toLowerCase();
            dayName = dayName.substring(0, 1).toUpperCase() + dayName.substring(1);

            System.out.println("The day on " + day + "/" + month + "/" + year + " is: " + dayName);
        }
    }

