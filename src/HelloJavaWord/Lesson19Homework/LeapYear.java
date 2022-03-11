package HelloJavaWord.Lesson19Homework;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args ){
        Scanner y= new Scanner(System.in);
        System.out.println("Input an year:");
        int year=y.nextInt();
        isLeap(year);
        // input date with validation?
    }
    public static void isLeap(int n) {
        if ((n % 4 == 0) && (n % 100 == 0) || (n % 400 == 0)) {
            System.out.println(" The Year " + n + " is Leap");
        } else System.out.println("The Year " + n + " is not Leap");
    }
}
