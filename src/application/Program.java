package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        Department depart = new Department();

        System.out.print("Nome do departamento: ");
        String nameDepartment = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine();

        depart = new Department(nameDepartment, payDay);

        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        Address address = new Address(email, phone);

        depart.setAdress(address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            sc.nextLine();
            System.out.println("Dados do funcionário " + i + ":");
            System.out.print("Nome: ");
            String nameEmployee = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            emp = new Employee(nameEmployee, salary);

            depart.addEmployee(emp);
        }

        System.out.println();
        showReport(depart);

        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println("Departamento " + dept.getName() + "= R$ " + String.format("%.2f", dept.payroll()));
        System.out.println("Pagamento realizado no dia " + dept.getPayDay());
        System.out.println("Funcionários:");
        for(Employee emp : dept.getEmployees()) {
            System.out.println(emp.getName());
        }
        System.out.println("Para dúvidas favor entrar em contato: " + dept.getAdress().getEmail());
    }
}
