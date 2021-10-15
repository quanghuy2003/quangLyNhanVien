package sercice;

import model.NhanVien;

public class QuanLyNhanVien implements QuanLy<NhanVien>{
     private NhanVien[] DanhSach = new NhanVien[3];
     private int size = 0;


    @Override
    public void them(NhanVien nhanVien) {
       DanhSach[size] = nhanVien;
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
            System.out.println(DanhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("huy",18,100000);
        ql.them(nv1);
        ql.print();
    }
}
