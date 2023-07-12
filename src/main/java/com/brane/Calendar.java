package com.brane;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    List<String> appointments = new ArrayList<>();

    public String addAppointment(String appointment) {
        appointments.add(appointment);
        return appointment + " added successfully";
    }

    public void print() {
        appointments.forEach(System.out::println);
    }
}
