package Problems.Strings;

import java.util.Scanner;

public class ValidationInput {

    Scanner scanner;

    public ValidationInput() {
        scanner = new Scanner(System.in);
    }

    public int inputInt() {
        int intInput = scanner.nextInt();
        while (intInput < 0) {
            System.out.println("The input should not be <0");
            intInput = scanner.nextInt();
        }
        scanner.nextLine();
        return intInput;
    }

    public String inputString() {
        return scanner.nextLine();
    }

    public double inputDouble() {
        double doubleInput = scanner.nextDouble();
        while (doubleInput < 0) {
            System.out.println("The input should not be <0.0");
            doubleInput = scanner.nextDouble();
        }
        return doubleInput;
    }

    public void closeScanner() {
        this.scanner.close();
    }
}

