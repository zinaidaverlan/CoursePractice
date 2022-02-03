package HelloJavaWord.Lesson5Homework;

import java.util.Scanner;

public class ClassRectangleArea {
    public static void main(String[] args) {
        Scanner widthObj = new Scanner(System.in);
        Scanner lengthObj = new Scanner(System.in);

        System.out.println("Input Width  for Rectangle 1:");
        int width1 = widthObj.nextInt();
        System.out.println("Input Length  for Rectangle 1:");
        int length1 = lengthObj.nextInt();

        System.out.println("Input Width  for Rectangle 2:");
        int width2 = widthObj.nextInt();
        System.out.println("Input Length  for Rectangle 2:");
        int length2 = lengthObj.nextInt();
        boolean test = true;

        while (test) {
            if (((width1 <= 0) || (length1 <= 0)) || ((width2 <= 0) || (length2 <= 0))) {
                System.out.println("This isn't an rectangle");
                break;
            } else {

                int area1 = width1 * length1;
                int area2 = width2 * length2;

                if (area1 > area2)
                    System.out.println("The Area of the Rectangle1 is greater than Area of the Rectangle 2");
                else if (area1 < area2)
                    System.out.println("The Area of the Rectangle2 is greater than Area of the Rectangle 1");
                else
                    System.out.println("The Area of the Rectangles are equal");
            }
            test = false;


        }
    }
}
