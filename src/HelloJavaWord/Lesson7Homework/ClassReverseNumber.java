package HelloJavaWord.Lesson7Homework;

import java.util.Scanner;

public class ClassReverseNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Input a positive int  number:");
        int nr = num.nextInt();
do
{System.out.print(nr % 10);
            nr=nr/10;}
while (nr!=0);


    }
}
