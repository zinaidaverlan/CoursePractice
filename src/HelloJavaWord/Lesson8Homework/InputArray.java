package HelloJavaWord.Lesson8Homework;

import java.util.Scanner;

public class InputArray {

    public static void inputArrayOneDim(int n) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input size of array:");
        n = s.nextInt();
        int[] array = new int[100];
        System.out.println("Input array:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Element of array:");
        for (int i = 0; i < n;i++){
            System.out.print(array[i]+"  ");
        }

    }

}



