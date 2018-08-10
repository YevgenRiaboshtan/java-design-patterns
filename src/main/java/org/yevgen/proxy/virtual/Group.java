package org.yevgen.proxy.virtual;

public class Group {
    private String groupName;

    private String groupDescription;

    private StudentList students;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public StudentList getStudents() {
        return students;
    }

    public void setStudents(StudentList students) {
        this.students = students;
    }
}
