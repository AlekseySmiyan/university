package smiyan.aleksey;

import smiyan.aleksey.data.Gender;

public class Student extends Human {

    private long id;
    private String groupName;

    public Student() {}

    public Student(String name, String lastName, int age, Gender gender, long id, String groupName) {
        super(name, lastName, age, gender);
        this.id = id;
        this.groupName = groupName;
    }

    public long getId() {
        return id;
    }

    public Student setId(long id) {
        this.id = id;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public Student setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                '}' +
                super.toString();
    }
}
