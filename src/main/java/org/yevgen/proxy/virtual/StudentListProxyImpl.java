package org.yevgen.proxy.virtual;

import java.util.List;

public class StudentListProxyImpl implements StudentList {

    private StudentList studentList;

    @Override
    public List<Student> getStudents() {
        if (studentList == null) {
            studentList = new StudentListImpl();
        }
        return studentList.getStudents();
    }
}
