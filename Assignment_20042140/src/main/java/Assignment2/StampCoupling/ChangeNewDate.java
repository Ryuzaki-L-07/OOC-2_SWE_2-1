package Assignment2.StampCoupling;

public class ChangeNewDate extends NewDate {
    void changeMonth(NewDate newDate, int month) {
        newDate.Month = month;
    }
}
//Here the data of the month is changed by passing the whole data structure