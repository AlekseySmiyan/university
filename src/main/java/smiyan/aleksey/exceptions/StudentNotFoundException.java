package smiyan.aleksey.exceptions;

public class StudentNotFoundException extends Exception{

    public StudentNotFoundException() {
        super("Student not found");
    }

    public StudentNotFoundException(String studentLastName) {
        super("Student " + studentLastName + " not found");
    }
}
