package HelloJavaWord.Lesson12Homework;

import java.util.Scanner;

public class ParkingProfit {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CustomerParking customer = new CustomerParking();
        Scanner str = new Scanner(System.in);
        boolean b = true;
        double profit = 0.0;

        while (b) {{
            System.out.println("How many hours do you park the car? ");
            int time = scanner.nextInt();
            System.out.println("Fee for parking:" + customer.calculateParkingCustomer(time));
            profit += customer.calculateParkingCustomer(time);
            System.out.println("Profit Parking=" + profit);
            System.out.println("Parking next car? -->  y -Yes / n - No");}
            String s = str.nextLine();
            if (s == "y") b = true;
            else if (s == "n") {
                b = false;
                break;
            } else {
                b = false;
                break;
            }
        }


    }
}


