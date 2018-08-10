package org.yevgen.proxy.virtual;

public class Main {

    public static void main(String... args) {
        StudentList studentList = new StudentListProxyImpl();
        Group group = new Group();
        group.setGroupName("Group1");
        group.setGroupDescription("Group description1");
        group.setStudents(studentList);

        System.out.println(group.getGroupName());
        System.out.println(group.getGroupDescription());

        for (Student student : group.getStudents().getStudents()) {
            System.out.println(student);
        }
    }
}
