import Assignment1.MonthNames;
import Assignment1.MyCalendar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCalenderTest {
    @Test
    public void YearCheck()
    {
        MyCalendar Date = new MyCalendar(31, 12, 2020, MonthNames.December);
        MyCalendar Ans = Date.calculateNextDate();
        Ans.DatePrint();
        MyCalendar Expected = new MyCalendar(1, 1, 2021, MonthNames.January);
        Expected.DatePrint();
        assertEquals(Expected.DatePrint(), Ans.DatePrint());
    }
    @Test
    public void MonthCheck()
    {
        MyCalendar Date = new MyCalendar(31, 1, 1969, MonthNames.January);
        MyCalendar Ans = Date.calculateNextDate();
        Ans.DatePrint();
        MyCalendar Expected = new MyCalendar(1, 2, 1969, MonthNames.February);
        Expected.DatePrint();
        assertEquals(Expected.DatePrint(), Ans.DatePrint());
    }
    @Test
    public void DayCheck()
    {
        MyCalendar Date = new MyCalendar(26, 7, 3021, MonthNames.July);
        MyCalendar Ans = Date.calculateNextDate();
        Ans.DatePrint();
        MyCalendar Expected = new MyCalendar(27, 7, 3021, MonthNames.July);
        Expected.DatePrint();
        assertEquals(Expected.DatePrint(), Ans.DatePrint());
    }
    @Test
    public void LeapYearCheck()
    {
        MyCalendar Date1 = new MyCalendar(28, 2, 2020, MonthNames.February);
        MyCalendar Ans1 = Date1.calculateNextDate();
        Ans1.DatePrint();
        MyCalendar Expected1 = new MyCalendar(29, 2, 2020, MonthNames.March);
        Expected1.DatePrint();
        assertEquals(Expected1.DatePrint(), Ans1.DatePrint());

        MyCalendar Date2 = new MyCalendar(29, 2, 2020, MonthNames.February);
        MyCalendar Ans2 = Date2.calculateNextDate();
        MyCalendar Expected2 = new MyCalendar(1, 3, 2020, MonthNames.March);
        assertEquals(Expected2.DatePrint(), Ans2.DatePrint());

        MyCalendar Date3 = new MyCalendar(28, 2, 2019, MonthNames.February);
        MyCalendar Ans3 = Date3.calculateNextDate();
        MyCalendar Expected3 = new MyCalendar(1, 3, 2019, MonthNames.March);
        assertEquals(Expected3.DatePrint(), Ans3.DatePrint());

//        MyCalendar Date4 = new MyCalendar(28, 2, 2024, MonthNames.February);
//        MyCalendar Ans4 = Date4.calculateNextDate();
//        MyCalendar Expected4 = new MyCalendar(29, 2, 2024, MonthNames.February);
//        assertEquals(Expected4.DatePrint(), Ans4.DatePrint());

    }

}
