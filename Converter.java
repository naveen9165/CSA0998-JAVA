import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Converter {

    public static void main(String[] args) {
        String indiaTime;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter time of India (HH:mm:ss):");
        indiaTime = s.nextLine();

        SimpleDateFormat sdfIndia = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdfIndia.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

        Date indiaDate;
        try {
            indiaDate = sdfIndia.parse(indiaTime);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Select time zone to convert:");
        System.out.println("1. USA (Eastern Time)");
        System.out.println("2. Queensland (Australia)");
        System.out.println("3. London");
        System.out.println("4. Japan");
        System.out.println("5. Brazil");
        System.out.println("6. South Africa");
        System.out.println("7. India Standard Time");
        System.out.println("8. China");
        System.out.println("9. Canada (Eastern Time)");
        System.out.println("10. Germany");

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                printConvertedDateTime(indiaDate, "America/New_York", "USA");
                break;
            case 2:
                printConvertedDateTime(indiaDate, "Australia/Sydney", "Queensland");
                break;
            case 3:
                printConvertedDateTime(indiaDate, "Europe/London", "London");
                break;
            case 4:
                printConvertedDateTime(indiaDate, "Asia/Tokyo", "Japan");
                break;
            case 5:
                printConvertedDateTime(indiaDate, "America/Sao_Paulo", "Brazil");
                break;
            case 6:
                printConvertedDateTime(indiaDate, "Africa/Johannesburg", "South Africa");
                break;
            case 7:
                printConvertedDateTime(indiaDate, "Asia/Kolkata", "India Standard Time");
                break;
            case 8:
                printConvertedDateTime(indiaDate, "Asia/Shanghai", "China");
                break;
            case 9:
                printConvertedDateTime(indiaDate, "Canada/Eastern", "Canada (Eastern Time)");
                break;
            case 10:
                printConvertedDateTime(indiaDate, "Europe/Berlin", "Germany");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private static void printConvertedDateTime(Date date, String timeZoneId, String location) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdfDay = new SimpleDateFormat("EEEE");
        SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm:ss a");

        sdfDate.setTimeZone(TimeZone.getTimeZone("GMT"));
        sdfDay.setTimeZone(TimeZone.getTimeZone(timeZoneId));
        sdfTime.setTimeZone(TimeZone.getTimeZone(timeZoneId));

        String convertedDate = sdfDate.format(date);
        String convertedDay = sdfDay.format(date);
        String convertedTime = sdfTime.format(date);

        Date currentDate = new Date();
        sdfTime.setTimeZone(TimeZone.getTimeZone(timeZoneId));
        String currentDateTime = sdfTime.format(currentDate);

        System.out.println("Current Time in " + location + ": " + currentDateTime);
        System.out.println(location + " Date: " + convertedDate);
        System.out.println(location + " Day: " + convertedDay);
        System.out.println(location + " Time: " + convertedTime);
    }
}