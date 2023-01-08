import java.util.Comparator;


public class DateTime {

    //class which holds all the functions related to DateTime

    //varibles to hold attributes of the time
    private int second;
    private int minute;
    private int hour;

    //variables to hold attributes if the date
    private int year;
    private int month;
    private int day;



    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year+"-"+month+"-"+day+"/"+hour+":"+minute+":"+second;
    }

    public int compareTo(DateTime dateTime) {
        return 0;
    }
}
