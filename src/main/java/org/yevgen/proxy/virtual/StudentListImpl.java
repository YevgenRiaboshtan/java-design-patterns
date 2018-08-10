package org.yevgen.proxy.virtual;

import java.util.Arrays;
import java.util.List;

public class StudentListImpl implements StudentList {
    @Override
    public List<Student> getStudents() {
        System.out.println("Fetch huge data");
        return Arrays.asList(
                new Student("studentName1", "studentSurname1", 10),
                new Student("studentName2", "studentSurname2", 20),
                new Student("studentName3", "studentSurname3", 30),
                new Student("studentName4", "studentSurname4", 40),
                new Student("studentName5", "studentSurname5", 50)
        );
    }
}
