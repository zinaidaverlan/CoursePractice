package HelloJavaWord.Lesson10Homework;

public enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekday() {
        if (this != SATURDAY && this != SUNDAY) return true;
        else return false;
    }

    boolean isHoliday() {
        if (this == SATURDAY || this == SUNDAY) return true;
        else return false;
    }
}
