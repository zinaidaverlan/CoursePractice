package HelloJavaWord.Lesson4Homework;

import java.util.Scanner;

public class ClassMinutesConverter {
    public static void main(String[] args) {
        Scanner minObj = new Scanner(System.in);
        System.out.println("Input the minutes:");
        long minutes = minObj.nextLong();

        double day = minutes / 1_440;
        double year = minutes / 525_600;

        System.out.println("Output the minutes in a day:" + day);
        System.out.println("Output the minutes in a year:" + year);


    }
}
