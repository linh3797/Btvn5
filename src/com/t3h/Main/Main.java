package com.t3h.Main;

import com.t3h.Bai1.Student;
import com.t3h.Bai1.StudentManager;
import com.t3h.qldb.DanhBa;
import com.t3h.qldb.QuanLy;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.printList();
        System.out.println("=================");
        sm.findStudentByScore(7.3f);
        System.out.println("========================");
        DanhBa bd = new DanhBa("Nguyen Van A", "035467322");
        QuanLy listDB = new QuanLy();
        listDB.add(bd);
        listDB.addDB("Nguyen Van B", "035467622");
        System.out.println();
        listDB.inMang();
        System.out.println();
        listDB.editDanhBa("035467622", "037466463");
        listDB.inMang();
        listDB.checkSDT("035467322");
        System.out.println();

    }
}
