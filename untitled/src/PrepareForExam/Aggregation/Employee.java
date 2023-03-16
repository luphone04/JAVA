package PrepareForExam.Aggregation;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Charlie");

        Department hr = new Department("Human Resources");
        hr.addEmployee(emp1);
        hr.addEmployee(emp2);

        Department it = new Department("Information Technology");
        it.addEmployee(emp3);

        System.out.println("Employees in the " + hr.getName() + " department:");
        for (Employee emp : hr.getEmployees()) {
            System.out.println(emp.getName());
        }

        System.out.println("Employees in the " + it.getName() + " department:");
        for (Employee emp : it.getEmployees()) {
            System.out.println(emp.getName());
        }
    }
}
