package model;

public class GiamDoc extends Nguoi {
    private double soLuongNhanVien;

    public GiamDoc(int id, String name, String age, double soLuongNhanVien) {
        super(id, name, age);
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public GiamDoc(double soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public double getSoLuongNhanVien() {
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(double soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public GiamDoc() {
    }

}
