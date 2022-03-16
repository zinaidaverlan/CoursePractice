package Problems.Strings;

public class MainTest {
    public static void main(String [] args){
        ValidationInput validationInput = new ValidationInput();
        System.out.println("Enter a string:");

        System.out.println(DigitSumFromString.returnSum(validationInput.inputString()));
    }

}
