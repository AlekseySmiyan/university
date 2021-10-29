package smiyan.aleksey;

import smiyan.aleksey.exceptions.StudentGroupOverflowException;
import smiyan.aleksey.exceptions.StudentNotFoundException;
import smiyan.aleksey.utils.StudentComparators;

import java.util.*;

public class Group {

    private final int studentsLimit = 10;
    private final Student[] students = new Student[studentsLimit];

    public Group(Student... students) {
        for (Student student: students) {
            try {
                addStudent(student);
            } catch (StudentGroupOverflowException e) {
                e.printStackTrace();
            }
        }
    }

    public void addStudent(Student student) throws StudentGroupOverflowException {
        for(int i=0; i<=studentsLimit; i++) {
            if(i == studentsLimit) throw new StudentGroupOverflowException(studentsLimit);
            if(students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void deleteStudent(long id) {
        for(int i=0; i<studentsLimit; i++) {
            if(students[i] != null && students[i].getId() == id) {
                students[i] = null;
                break;
            }
        }
    }

    public Student searchStudent(String lastName) throws StudentNotFoundException {
        Student student = null;
        for (int i=0; i<studentsLimit; i++) {
            if(students[i] != null && students[i].getLastName().equals(lastName)) {
                student = students[i];
                break;
            }
        }

        if(student == null) {
            throw new StudentNotFoundException(lastName);
        }

        return student;
    }

    public Student[] sortStudent() {
        return sortStudent(StudentComparators.lastNameComparator);
    }

    public Student[] sortStudent(Comparator<Student> comparator) {

        List<Student> sortedStudents = new ArrayList<>(Arrays.asList(students));
        sortedStudents.removeIf(Objects::isNull);
        sortedStudents.sort(comparator);

        return sortedStudents.toArray(new Student[0]);
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
