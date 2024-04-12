
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        Date d1 = sdf1.parse("04/11/2024");
        Date d2 = sdf2.parse("04/11/2024 15:10:32");
        Date d3 = Date.from(Instant.parse("2024-04-11T16:09:32Z"));

        System.out.println(d1);
        System.out.println(d2);

        System.out.println("d1: " + sdf1.format(d1));
        System.out.println("d2: " + sdf2.format(d2));
        System.out.println("d3: " + sdf2.format(d3));
        System.out.println("d3 GMT: " + sdf3.format(d3));
        System.out.println("x1: " + sdf1.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf1.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("----------------------------");
        System.out.println("d1: " + sdf3.format(d1));
        System.out.println("d2: " + sdf3.format(d2));
        System.out.println("d3: " + sdf3.format(d3));
        System.out.println("d3 GMT: " + sdf3.format(d3));
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));


     sc.close();

    }

}