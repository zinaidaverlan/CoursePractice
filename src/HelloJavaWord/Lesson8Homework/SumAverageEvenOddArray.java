package HelloJavaWord.Lesson8Homework;

import java.util.Scanner;

public class SumAverageEvenOddArray {
    public static int sumArrayOneDim(int n) {

        int[] returnedArray = InputArray.inputArrayOneDim(n);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += returnedArray[i];
        }
        return sum;
    }

    public static double averageArrayOneDim(int n) {
        double avg = sumArrayOneDim(n) / n;
        return avg;
    }

    public static int numEvenArrayOneDim(int n) {
        int[] returnedArray = InputArray.inputArrayOneDim(n);
        int nrEven = 0;
        for (int i = 0; i < n; i++) {
            if (returnedArray[i] % 2 == 0) nrEven += 1;
        }
        return nrEven;
    }
    public static int numOddArrayOneDim(int n) {
        int[] returnedArray = InputArray.inputArrayOneDim(n);
        int nrOdd = 0;
        for (int i = 0; i < n; i++) {
            if (returnedArray[i] % 2 == 1) nrOdd += 1;
        }
        return nrOdd;
    }

}
