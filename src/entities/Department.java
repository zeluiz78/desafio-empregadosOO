package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private int payDay;

    Address address = new Address();

    List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(String name, int payDay) {
        this.name = name;
        this.payDay = payDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address adress) {
        this.address = adress;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employees.remove(emp);
    }

    public double payroll() {
        double sum = 0.0;
        for(Employee emp : employees) {
            sum += emp.getSalary();
        }
        return sum;
    }
}
