package Day_30_DateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _2_timeExsample {
    public static void main(String[] args) {
//        DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
//        Date tarih = new Date();
//        System.out.println(sdf.format(tarih));

        LocalDateTime tarih = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dtf.format(tarih));

    }
}
