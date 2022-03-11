package HelloJavaWord.Lesson19Homework;

import java.time.LocalDate;
import java.time.Period;

public class NumberDay {
    //input date with validation
    public static void main(String [] args){
    LocalDate date1 = LocalDate.of(2022, 01, 24);
    LocalDate date2 = LocalDate.of(2022, 03, 11);
    Period period= Period.between(date1,date2);
    System.out.println("We study a period of "+period+" days");

}}
