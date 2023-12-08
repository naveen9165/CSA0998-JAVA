import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class TimeConverter {

    public static void main(String[] args) {
        String indiaTime;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter time of India (HH:mm:ss):");
        indiaTime = s.nextLine();

        SimpleDateFormat sdfIndia = new SimpleDateFormat("HH:mm:ss");
        sdfIndia.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

        Date indiaDate;
        try {
            indiaDate = sdfIndia.parse(indiaTime);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        printTime("India Time", indiaDate, "Asia/Kolkata");
        printTime("USA Time", indiaDate, "America/New_York");
        printTime("Queensland Time", indiaDate, "Australia/Sydney");
        printTime("London Time", indiaDate, "Europe/London");
    }

    private static void printTime(String label, Date date, String timeZoneId) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy EEE HH:mm:ss a");
        sdf.setTimeZone(TimeZone.getTimeZone(timeZoneId));

        // Set the date part to the current date
        Date currentDate = new Date();
        currentDate.setHours(date.getHours());
        currentDate.setMinutes(date.getMinutes());
        currentDate.setSeconds(date.getSeconds());

        String formattedTime = sdf.format(currentDate);
        System.out.println(label + ": " + formattedTime);
    }
}