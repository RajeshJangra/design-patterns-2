package com.brane;

import com.brane.Calendar;

public class CalendarApp {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        calendar.addAppointment("Meet Sales at 6PM");
        calendar.addAppointment("Meet Tech at 4PM");
        calendar.print();
    }
}
