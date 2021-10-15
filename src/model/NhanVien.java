package model;

public class NhanVien extends Nguoi {
    private double salary;

    public NhanVien(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public NhanVien() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "NhanVien{name " + getName() + " , tuổi = " + getAge() +
                ", lương =" + salary +
                '}';
    }
}
