package HelloJavaWord.Lesson12Homework;

public class CustomerParking {
    private int timeParking;
    private final double minFee = 2.0;
    private final double maxFee = 10.0;
    private final double addFee = 0.5;
    private double feeCustomer;

    public CustomerParking() {
    }

    public double getFeeCustomer() {
        return feeCustomer;
    }

    public void setTimeParking(int timeParking) {
        this.timeParking = timeParking;
    }
    public int validationTimeParking(int timeParking){
        if (timeParking>=0) return this.timeParking=timeParking;
    else return this.timeParking=0;
    }

    public double calculateParkingCustomer(int t) {
        if (t < 3) feeCustomer = minFee;
        else if (t >= 3 && t < 24) feeCustomer =  ((t- 3) * addFee)+minFee;
        else if (t >= 24 && t < 48) feeCustomer = maxFee;
        else if (t >= 48) feeCustomer = t / 24 * maxFee;
        return feeCustomer;

    }
}
