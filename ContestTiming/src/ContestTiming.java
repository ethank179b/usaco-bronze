import java.util.Scanner;

public class ContestTiming {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);

        // Contest start time: 11th November, 11:11 AM
        final int START_DAY = 11;
        final int START_HOUR = 11;
        final int START_MINUTE = 11;

        // Read input for ending time: day, hour, minute
        int endDay = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        // Convert the start time to minutes since 11/11 11:11
        int startTimeInMinutes = (START_DAY * 24 * 60) + (START_HOUR * 60) + START_MINUTE;

        // Convert the end time to minutes
        int endTimeInMinutes = (endDay * 24 * 60) + (endHour * 60) + endMinute;

        // Calculate the difference in minutes
        int timeSpent = endTimeInMinutes - startTimeInMinutes;

        // Output the result or -1 if the ending time is earlier than the start time
        System.out.println("Output: ");
        if (timeSpent < 0) {
            System.out.println(-1);
        } else {
            System.out.println(timeSpent);
        }

        sc.close();
    }
}
