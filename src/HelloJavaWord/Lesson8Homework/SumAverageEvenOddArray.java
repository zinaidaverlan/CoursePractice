package HelloJavaWord.Lesson8Homework;

import java.util.Scanner;

public class SumAverageEvenOddArray {
    public static int sumArrayOneDim(int n) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input size of array:");
        n = s.nextInt();
        int[] array = new int[100];
        System.out.println("Input array:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
          int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;

    }
    public static double averageArrayOneDim(int n){
        double avg=sumArrayOneDim(n)/n;
        return avg;
    }
    public static int numEvenArrayOneDim(int n){
        Scanner s = new Scanner(System.in);
        System.out.println("Input size of array:");
        n = s.nextInt();
        int[] array = new int[100];
        System.out.println("Input array:");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        int nrEven = 0;
        for (int i = 0; i < n; i++) {
            if  ( array[i] % 2==0)   nrEven+=1;
        }
        return nrEven;
    }

}
