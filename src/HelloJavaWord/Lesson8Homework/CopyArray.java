package HelloJavaWord.Lesson8Homework;

public class CopyArray {
    public static void copyArray(int n) {
        int[] returnedArray = InputArray.inputArrayOneDim(n);
        int[] copyNewArray = new int[100];
        for (int i = 0; i < n; i++) {
            copyNewArray[i] = returnedArray[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(copyNewArray[i]);
        }

    }
}
