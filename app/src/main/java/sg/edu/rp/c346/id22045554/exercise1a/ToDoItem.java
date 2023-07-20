package sg.edu.rp.c346.id22045554.exercise1a;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private Calendar date;
    private int day;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }
    public ToDoItem(String title, Calendar date, int day) {
        this.title = title;
        this.date = date;
        this.day = day;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH)
                + "/" + date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {

        // Complete the code here

        String weekday = "";
        if (day == 1) {
            weekday = "Monday";
        } else if (day == 2) {
            weekday = "Tuesday";
        } else if (day == 3) {
            weekday = "Wednesday";
        } else if (day == 4) {
            weekday = "Thursday";
        } else {
            weekday ="Friday";
        }


        return weekday;
    }
}

