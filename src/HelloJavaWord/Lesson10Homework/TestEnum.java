package HelloJavaWord.Lesson10Homework;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println("Print the months of the calendaristic year:");
        Months[] month = Months.values();
        for (int i = 0; i < month.length; i++) {
            System.out.print(month[i] + " ");
        }
        System.out.println();
        System.out.println(" Is WeekDay this day:");
        System.out.println("Saturday - " + WeekDay.SATURDAY.isWeekday());
        System.out.println("Friday - " + WeekDay.FRIDAY.isWeekday());
        System.out.println("Is Holiday this day:");
        System.out.println("Monday -" +WeekDay.MONDAY.isHoliday());
        System.out.println("Sunday -" + WeekDay.SUNDAY.isHoliday());
    }

}
