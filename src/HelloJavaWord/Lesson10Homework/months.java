package HelloJavaWord.Lesson10Homework;

class Test{
    public enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOMBER, NOVEMBER, DECEMBER
    }
    public static void main(String[] args) {

        Months[] months= Months.values();
        for (int i=0; i<months.length; i++) {
            System.out.print(months[i]+ " ");
        }
    }

}

