package sercice;

import model.NhanVien;

public class QuanLyNhanVien implements QuanLy<NhanVien>{
     private NhanVien[] danhSach = new NhanVien[3];
     private int size = 0;


    @Override
    public void them(NhanVien nhanVien) {
       danhSach[size] = nhanVien;
       size++;
    }

    @Override
    public void sua(NhanVien nhanVien) {

    }

    @Override
    public void xoa(NhanVien nhanVien) {

    }

    @Override
    public NhanVien timKiem(String name) {
        return null;

    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien(1,"huy",18,100000);
        ql.them(nv1);
        ql.print();
    }
}
