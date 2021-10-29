package smiyan.aleksey;

import smiyan.aleksey.exceptions.StudentNotFoundException;

import java.util.Arrays;

import static smiyan.aleksey.data.Gender.FEMALE;
import static smiyan.aleksey.data.Gender.MALE;

public class Runner {

    public static void main(String[] args) {
        Group group = new Group(
                new Student("Yevhen", "Konoplyanka", 21, MALE, 1, "Sport"),
                new Student("Lucia", "Bronze", 19, FEMALE, 1, "Sport")
        );

        // sorted by last name
        Student[] sortStudents = group.sortStudent();
        System.out.println(Arrays.toString(sortStudents));

        // search
        Student student = null;
        try {
            student = group.searchStudent("Bronzee");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        if(student != null) {
            System.out.println(student);
        }

    }
}
