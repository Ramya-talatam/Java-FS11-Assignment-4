import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(101, "Ramya", "Manager", 50000));
        employeeList.add(new Employee(102, "Arya", "Developer", 60000));
        employeeList.add(new Employee(103, "Maya", "Tester", 55000));

        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        System.out.println("Sorted by Name:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });

        System.out.println("\nSorted by Salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
