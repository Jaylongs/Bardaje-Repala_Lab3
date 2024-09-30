import java.util.Scanner;

public class Clock {

    // Convert seconds to minutes
    public double SecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    // Convert seconds to hours
    public double SecondsToHours(int seconds) {
        return seconds / 3600.0;
    }

    // Convert minutes to seconds
    public int MinutesToSeconds(int minutes) {
        return minutes * 60;
    }

    // Convert minutes to hours
    public double MinutesToHours(int minutes) {
        return minutes / 60.0;
    }

    // Convert hours to seconds
    public int HoursToSeconds(int hours) {
        return hours * 3600;
    }

    // Convert hours to minutes
    public int HoursToMinutes(int hours) {
        return hours * 60;
    }

    
    public void displayMenu() {
        System.out.println("Choose a conversion type:");
        System.out.println("1. Seconds to Minutes");
        System.out.println("2. Seconds to Hours");
        System.out.println("3. Minutes to Seconds");
        System.out.println("4. Minutes to Hours");
        System.out.println("5. Hours to Seconds");
        System.out.println("6. Hours to Minutes");
        System.out.print("Select an option (1-6): ");
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock();
        boolean continueConversion = true;

        while (continueConversion) {
            clock.displayMenu();
            int choice = scanner.nextInt();

            // Enter the value to be converted
            System.out.print("Enter the value: ");
            int value = scanner.nextInt();
            double result = 0;
            String conversionType = "";

           
            switch (choice) {
                case 1:
                    result = clock.SecondsToMinutes(value);
                    conversionType = "Seconds to Minutes";
                    break;
                case 2:
                    result = clock.SecondsToHours(value);
                    conversionType = "Seconds to Hours";
                    break;
                case 3:
                    result = clock.MinutesToSeconds(value);
                    conversionType = "Minutes to Seconds";
                    break;
                case 4:
                    result = clock.MinutesToHours(value);
                    conversionType = "Minutes to Hours";
                    break;
                case 5:
                    result = clock.HoursToSeconds(value);
                    conversionType = "Hours to Seconds";
                    break;
                case 6:
                    result = clock.HoursToMinutes(value);
                    conversionType = "Hours to Minutes";
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    continue;
            }

            
            System.out.println(conversionType + ": " + result);

            
            System.out.print("Do you want to convert time again? (Y/N): ");
            char response = scanner.next().toUpperCase().charAt(0);

            if (response == 'N') {
                continueConversion = false;
                System.out.println("Thank you for using the time converter!");
            }
        }

        scanner.close();
    }
}
