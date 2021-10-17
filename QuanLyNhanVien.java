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
        danhSach[timKiem(nhanVien.getName())] = nhanVien;
    }

    @Override
    public void xoa(NhanVien nhanVien) {

    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == danhSach[i].getName());
            return i;
        }
        return -1;

    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien(1,"huy",18,100000);
        NhanVien nv2 = new NhanVien(2,"vvvv",1,10000);
        ql.them(nv1);
        ql.print();
        System.out.println(ql.timKiem("huy"));
        ql.sua("huy", nv2);
        ql.print();
    }

    private void sua(String huy, NhanVien nv2) {
    }

}
