package com.t3h.Bai1;

import java.util.Arrays;

public class StudentManager {
    private Student[] students = new Student[5];
    private Object Student;

    public StudentManager() {
        students[0] = new Student(1, "Nguyen Van A", 5.4f);
        students[1] = new Student(2, "Nguyexn Van B",4.7f);
        students[2] = new Student(3, "Tran Van Thich", 7.3f);
        students[3] = new Student(4, "Thich Van Khau", 8.7f);
        students[4] = new Student(5, "Tran Thu Do", 7.3f);
    }

    public void printList() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void findStudentByScore(float score) {
        int dem = 0;
        for (int i = 0; i <students.length ; i++) {
            if (students[i].getScore() == score)
                System.out.println(students[i]);
            dem= dem + 1;
        }
        if (dem == 0) System.out.println("null");
    }


}
