package HelloJavaWord.Lesson8Homework;

public class MaxMinArray {
    public static int maxArrayOneDim(int n) {
        int[] returnedArray = InputArray.inputArrayOneDim(n);
        int max = returnedArray[0];
        for (int i = 0; i < n; i++) {
            if (returnedArray[i] > max) max = returnedArray[i];
        }
        return max;
    }
    public static int minArrayOneDim(int n) {
        int[] returnedArray = InputArray.inputArrayOneDim(n);
        int min = returnedArray[0];
        for (int i = 0; i < n; i++) {
            if (returnedArray[i] > min) min = returnedArray[i];
        }
        return min;

    }
}
