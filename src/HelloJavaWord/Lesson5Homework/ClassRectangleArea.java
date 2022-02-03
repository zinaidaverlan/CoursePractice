package HelloJavaWord.Lesson5Homework;

import java.util.Scanner;

public class ClassRectangleArea {
    public static void main(String[] args) {
        Scanner widthObj = new Scanner(System.in);
        Scanner lengthObj = new Scanner(System.in);

        System.out.println("Input Width  for Rectangle 1:");
        double width1 = widthObj.nextDouble();
        System.out.println("Input Length  for Rectangle 1:");
        double length1 = lengthObj.nextDouble();

        System.out.println("Input Width  for Rectangle 2:");
        double width2 = widthObj.nextDouble();
        System.out.println("Input Length  for Rectangle 2:");
        double length2 = lengthObj.nextDouble();

        double area1 = width1 * length1;
        double area2 = width2 * length2;

        if (area1>area2)
            System.out.println("The Area of the Rectangle1 is greater than Area of the Rectangle 2");
        else if (area1<area2)
            System.out.println("The Area of the Rectangle2 is greater than Area of the Rectangle 1");
        else
            System.out.println("The Area of the Rectangles are equal");


    }
}
