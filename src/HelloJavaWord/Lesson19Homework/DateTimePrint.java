package HelloJavaWord.Lesson19Homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimePrint {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2021, 03, 22);
        LocalTime time1 = LocalTime.of(03, 15);
        System.out.println("My daughter is born: " + date1 + " h: " + time1);
        LocalDateTime dt1 = LocalDateTime.of(2015,02,11, 15,40);
        System.out.println("I said YES: " + dt1);
        LocalDate date2 = LocalDate.of(2022, 03, 07);
        LocalTime time2 = LocalTime.of(22,05);
        System.out.println("I work at homework: "+date2 + time2);
    }
}