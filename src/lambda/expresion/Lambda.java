/* with lambda expresion */
package lambda.expresion;

public class Lambda {
    interface NumericTest {
        boolean computeTest(int n);
    }

    public static void main(String[] args) {
        NumericTest isEven= (n)->(n % 2)==0;
        NumericTest isNegative= (n)-> (n<0);
        System.out.println("Number is even:"+isEven.computeTest(7));
        System.out.println(("Number is negative:"+ isNegative.computeTest(-4)));
    }
}
