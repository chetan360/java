/*
a) Write a java program to display the system date and time in various formats shown
below :

    Current date is : 31/08/2021
    Current date is : 08-31-2021
    Current date is : Tuesday August 31 2021
    Current date and time is : Fri August 31 15:25:59 IST 2021
    Current date and time is : 31/08/21 15:25:59 PM +0530
    Current time is : 15:25:59
    Current week of year is : 35
    Current week of month : 5
    Current day of the year is : 243
    Note: Use java.util.Date and java.text.SimpleDateFormat class

 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Asg1Ba {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // Format 1: dd/MM/yyyy
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + format1.format(currentDate));

        // Format 2: MM-dd-yyyy
        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + format2.format(currentDate));

        // Format 3: EEEE MMMM dd yyyy
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : " + format3.format(currentDate));

        // Format 4: EEE MMM dd HH:mm:ss z yyyy
        SimpleDateFormat format4 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is : " + format4.format(currentDate));

        // Format 5: dd/MM/yy HH:mm:ss a Z
        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        System.out.println("Current date and time is : " + format5.format(currentDate));

        // Format 6: HH:mm:ss
        SimpleDateFormat format6 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time is : " + format6.format(currentDate));

        // Format 7: w
        SimpleDateFormat format7 = new SimpleDateFormat("w");
        System.out.println("Current week of year is : " + format7.format(currentDate));

        // Format 8: W
        SimpleDateFormat format8 = new SimpleDateFormat("W");
        System.out.println("Current week of month : " + format8.format(currentDate));

        // Format 9: D
        SimpleDateFormat format9 = new SimpleDateFormat("D");
        System.out.println("Current day of the year is : " + format9.format(currentDate));
    }
}
