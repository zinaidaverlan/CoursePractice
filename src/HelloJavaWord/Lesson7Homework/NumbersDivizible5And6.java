package HelloJavaWord.Lesson7Homework;

public class NumbersDivizible5And6 {
    public static void main(String[] args) {
        System.out.println("Numbers divizible by 5 and 6 from 100 to 1000:");
        int i=0;
        for ( i = 100; i <= 1000; i++) {
if (( i % 5==0)&&(i % 6==0))
            System.out.print(i + " ");
        }

    }
}
