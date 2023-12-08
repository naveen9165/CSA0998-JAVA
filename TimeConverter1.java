import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeConverter1 {

    public static void main(String[] args) {
        printCurrentTime("Asia/Kolkata", "India Time");
        printCurrentTime("America/New_York", "USA Time");
        printCurrentTime("Australia/Sydney", "Queensland Time");
        printCurrentTime("Europe/London", "London Time");
    }

    private static void printCurrentTime(String timeZoneId, String timeZoneName) {
         SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy hh:mm:ss a");
        sdf.setTimeZone(TimeZone.getTimeZone(timeZoneId));
        String currentTime = sdf.format(new Date());

        System.out.println(timeZoneName + ": " + currentTime);
    }
}