package com.t3h.qldb;

public class DanhBa {
    private String ten;
    private String sdt;

    public DanhBa(String ten, String sdt) {
        this.ten = ten;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String toString() {
        return ten + "_" + sdt;
    }
}
