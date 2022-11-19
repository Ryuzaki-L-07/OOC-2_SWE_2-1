package Assignment1;

public enum MonthNames {
    January("31DayMonth"),
    February("LeapMonth"),
    March("31DayMonth"),
    April("30DayMonth"),
    May("31DayMonth"),
    June("30DayMonth"),
    July("31DayMonth"),
    August("31DayMonth"),
    September("30DayMonth"),
    October("31DayMonth"),
    November("30DayMonth"),
    December("31DayMonth");

    String type;
    MonthNames(String type) {
        this.type = type;
    }
    public static final MonthNames[] Months = values();
    MonthNames NextMonth(){
        return Months[(this.ordinal() + 1) % Months.length];
    }
}