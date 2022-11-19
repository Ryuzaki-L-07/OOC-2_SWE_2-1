package Assignment1;
public class DateCalculator{
    boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100!= 0));
    }
    public MyCalendar nextDate(MyCalendar myCalendar) {
        int day = myCalendar.day;
        int month = myCalendar.month;
        int year = myCalendar.year;
        String type = String.valueOf(myCalendar.monthName.type);

//        System.out.println(type + "\n");
        if(type == "31DayMonth") {
            if(day == 31) {
                myCalendar.monthName = myCalendar.monthName.NextMonth();
                day = 1;
                month++;
                if(month > 12) {
                    month = 1;
                    year++;
                }
            }
            else day++;
        }
        else if(type == "30DayMonth") {
            if(day == 30) {
                day = 1;
                month++;
                if(month > 12) {
                    month = 1;
                    year++;
                }
                myCalendar.monthName = myCalendar.monthName.NextMonth();
            }
            else day++;
        }
        else if(type == "LeapMonth"){
            if(day == 29) {
                day = 1;
                month++;
                myCalendar.monthName = myCalendar.monthName.NextMonth();
            }
            else if(day == 28) {
                if(isLeapYear(year)) day++;
                else {
                    day = 1;
                    month++;
                }
                myCalendar.monthName = myCalendar.monthName.NextMonth();
            }
            else day++;
        }
        MyCalendar ret = new MyCalendar(day, month, year, myCalendar.monthName);
        return ret;
    }
}
