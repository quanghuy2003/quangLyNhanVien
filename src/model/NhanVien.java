package model;

public class NhanVien extends Nguoi {
    private double salary;

    public NhanVien(int id, String name, String age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public NhanVien(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public NhanVien(String huy, int i, int i1) {
    }

    @Override
    public String toString() {
        return "NhanVien{name +" + getName() + " ,tuổi = " + getSalary() +
                "lương =" + salary +
                '}';
    }
}
