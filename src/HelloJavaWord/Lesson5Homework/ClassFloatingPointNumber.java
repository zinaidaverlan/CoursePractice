package HelloJavaWord.Lesson5Homework;

import java.util.Scanner;

public class ClassFloatingPointNumber {
    public static void main(String[] args) {
        System.out.println("Input a float number:");
        Scanner ObjNumber = new Scanner(System.in);
        float number = ObjNumber.nextFloat();

        if (number == 0)
            System.out.println("Output: number is zero");
        else if (number < 0) System.out.println("Output: number is negative");
        else System.out.println("Output: number is positive");

        if (Math.abs(number)<1)
            System.out.println("Output: number is small");
        else  if (Math.abs(number)>1000000) System.out.println("Output: number is large");
        else System.out.println("Output: number between[1,1000000]");
    }
}