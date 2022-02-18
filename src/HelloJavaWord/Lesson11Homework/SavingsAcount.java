package HelloJavaWord.Lesson11Homework;

public class SavingsAcount {
    static double annualInterestRate;
    private double savingsBalance;

    public double calculateMonthlyInterest(double savBal){
        return(savingsBalance+(savBal*0.04)/12);
    }
}
