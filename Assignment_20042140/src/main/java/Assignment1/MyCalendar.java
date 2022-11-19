package Assignment1;

public class MyCalendar {
    int day;
    int month;
    int year;
    MonthNames monthName;
    public MyCalendar(){}

    public MyCalendar(int day, int month, int year, MonthNames monthName) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.monthName = monthName;
    }
    
    public String DatePrint() {
        return (this.day + "-" + this.month + "-" + this.year + "-" + this.monthName);
    }

    public MyCalendar calculateNextDate() {
        DateCalculator dc = new DateCalculator();
        MyCalendar mc = new MyCalendar(this.day, this.month, this.year, this.monthName);
        MyCalendar ans = dc.nextDate(mc);
        return ans;
    }
}
