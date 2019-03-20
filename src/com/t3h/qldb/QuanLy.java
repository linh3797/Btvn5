package com.t3h.qldb;

import java.util.ArrayList;

public class QuanLy {
    ArrayList<DanhBa> listDB = new ArrayList<>();
    private boolean ckeck = true;
    public QuanLy() {

    }

    public void add(DanhBa danhBa) {
        listDB.add(danhBa);
    }

    public boolean checkSDT(String gtSDT) {
        for (int i = 0; i < listDB.size(); i++) {
            if (listDB.get(i).getSdt() == gtSDT ) return true;
        }
        return false;
    }

    public void addDB(String gtTen, String gtSDT) {
        int dem = 0;
        for (DanhBa addDB : listDB //chi duyet tai doi tuong addDB, k phai duyet tat ca listDB
        ) {
            if (checkSDT(gtSDT)) {
                System.out.println("Danh ba nay da ton tai!");
            } else {
                dem = dem + 1;
            }

        }
        if (dem != 0) {
            DanhBa danhBa = new DanhBa(gtTen, gtSDT);
            listDB.add(danhBa);
            System.out.println("Da them thanh cong : " + danhBa);
        }
    }

    public void editDanhBa(String gtriSDT, String SDTMoi) {
        for (DanhBa db : listDB
        ) {
            if (db.getSdt() == gtriSDT) {
                db.setSdt(SDTMoi);
            }

        }
    }
    public void inMang() {
        for (DanhBa db : listDB
        ) {
            System.out.println(db);

        }
    }
}
