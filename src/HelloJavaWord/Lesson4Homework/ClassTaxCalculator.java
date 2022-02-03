package HelloJavaWord.Lesson4Homework;

import java.util.Scanner;

public class ClassTaxCalculator {
    public static void main(String[] args) {
        Scanner priceObj = new Scanner(System.in);
        Scanner taxObj = new Scanner(System.in);
        Scanner quantityObj = new Scanner(System.in);

        System.out.println("Input the price:");
        double price = priceObj.nextDouble();
        System.out.println("Input the tax:");
        double tax = taxObj.nextDouble();
        System.out.println("Input the quantity:");
        int quantity = quantityObj.nextInt();

        double total = price * tax * quantity;
        System.out.println("Output the total cost with tax:" + total);


    }
}
