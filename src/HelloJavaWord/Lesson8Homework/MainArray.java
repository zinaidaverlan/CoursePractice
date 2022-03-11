package HelloJavaWord.Lesson8Homework;

import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        int nrTask;
        Scanner s = new Scanner(System.in);
                boolean test = true;
        while (test) {
            System.out.println("Input number of Problem:");
            nrTask = s.nextInt();
            switch (nrTask) {
                case 1:
                    InputArray.inputArrayOneDim(6);
                    break;
                case 2:
                    System.out.println("Array sum=" + SumAverageEvenOddArray.sumArrayOneDim(10));
                    break;
                case 3:
                    System.out.println("Average array=" + SumAverageEvenOddArray.averageArrayOneDim(10));
                    break;
                case 4:
                    System.out.println("Nr Even elements array=" + SumAverageEvenOddArray.numEvenArrayOneDim(10));
                    break;
                case 5:
                    System.out.println("Nr Odd elements array=" + SumAverageEvenOddArray.numOddArrayOneDim(10));
                    break;
                case 6:
                    System.out.println("Maxim array=" + MaxMinArray.maxArrayOneDim(10));
                    break;
                case 7:
                    System.out.println("Minim array=" + MaxMinArray.minArrayOneDim(10));
                    break;
                case 8:
                    System.out.println("Copy array:");
                    CopyArray.copyArray(10);
                    break;

                default:
                    System.out.println("Invalid task!");
            }
            System.out.println("Input command?  yes/ not ");
            String sir1 = s.next();
            String sir = new String("yes");

            if (sir1.equals(sir1)) {
                test = true;
            } else test = false;

        }
    }
}
