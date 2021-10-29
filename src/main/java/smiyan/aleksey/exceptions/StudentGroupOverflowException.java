package smiyan.aleksey.exceptions;

public class StudentGroupOverflowException extends Exception{

    public StudentGroupOverflowException() {
        super("Students limit exceeded");
    }

    public StudentGroupOverflowException(int groupLimit) {
        super("Students limit " + groupLimit + " exceeded");
    }
}
