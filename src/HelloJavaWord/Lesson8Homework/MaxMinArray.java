package HelloJavaWord.Lesson8Homework;

import java.util.Scanner;

public class MaxMinArray {
    public static int maxArrayOneDim(int n) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input size of array:");
        n = s.nextInt();
        int[] array = new int[100];
        System.out.println("Input array:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i]>max) max = array[i];
        }
        return max;

    }
}
