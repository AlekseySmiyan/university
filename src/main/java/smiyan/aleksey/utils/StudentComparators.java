package smiyan.aleksey.utils;

import smiyan.aleksey.Student;

import java.util.Comparator;

public class StudentComparators {

    public static Comparator<Student> lastNameComparator =
            (o1, o2) -> o1.getLastName().compareToIgnoreCase(o2.getLastName());
}
