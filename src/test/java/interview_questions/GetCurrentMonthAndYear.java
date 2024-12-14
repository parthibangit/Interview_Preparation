package interview_questions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentMonthAndYear {

    public static void main(String[] args) {

        System.out.println(getCurrentMonth());
        System.out.println(getCurrentYear());
        System.out.println(getCurrentMonthAsString());
        System.out.println(getlessThanCurrentMonth());
    }

    public static int getCurrentMonth() {

        return LocalDate.now().getMonth().getValue();
    }

    public static String getCurrentMonthAsString() {

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMM");
        return format.format(date);
    }

    public static int getCurrentYear() {
        return LocalDate.now().getYear();
       // return Year.now().getValue();
    }

    public static String getlessThanCurrentMonth() {

        SimpleDateFormat format = new SimpleDateFormat("MMM");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        return format.format(cal.getTime());
    }
}
