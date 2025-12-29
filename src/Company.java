import java.util.Arrays;


public class Company {
    private String name;
    private String address;
    private String phone;
    private Employee[] employees;

    public Company(String name, String address, String phone, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.employees = employees;
    }

    // Создать метод, который выводит на экран имя сотрудника с самой большой зарплатой.
    public void printMaxSalaryEmployeeName() {
        long max = 0;
        String maxSalaryEmployeeName = "";
        for (Employee employee : employees) {
            if (employee.getSalary() == max) {
                maxSalaryEmployeeName = maxSalaryEmployeeName + "," + employee.getName();
            }

            if (employee.getSalary() > max) {
                max = employee.getSalary();
                maxSalaryEmployeeName = employee.getName();
            }


        }
        System.out.println("Task 1. Name(s) of employee(s) with highest salary: " + maxSalaryEmployeeName);
    }

    // task 4 Создать метод, который выводит на экран размер затрат на зарплату.
    public void printTotalSalary() {
        long total = 0;
        for (Employee salary : employees) {
            total += salary.getSalary();
        }
        System.out.println("Task 4. Total Salary is " + total);
    }

    //task 5 Создать метод, который выводит на экран среднюю зарплату в компании.
    public void printMediumSalary() {
        float total = 0;
        float numOfEmployees = 0;
        float medium = 0;
        for (Employee employee : employees) {
            numOfEmployees++;
        }
        for (Employee salary : employees) {
            total += salary.getSalary();
        }
        medium = total / numOfEmployees;
        System.out.println("Task 5. Medium Salary is " + medium);
    }

    // task 2.  Создать метод, который позволяет добавить нового сотрудника
    // task 6. При добавлении нового сотрудника проверять не является ли его зарплата ниже разрешенной.
    public void addEmployee(String name, String phone, long salary) {
        Employee newEmployee = new Employee(name, phone, salary);
        long minSalary = 2000;
        String newEmployeeName = "";
        int currentSize = employees.length;
        int newSize = currentSize + 1;
        Employee[] tempArray = new Employee[newSize];
        for (int i = 0; i < currentSize; i++) {
            tempArray[i] = employees[i];
        }

        if (newEmployee.getSalary() >= minSalary) {
            tempArray[newSize - 1] = newEmployee;
            employees = tempArray;
            newEmployeeName = newEmployee.getName();
            System.out.println("Task 2 & 6. A new Employee was added to our Company: " + newEmployeeName);
            System.out.println("Task 2 & 6. New List of Employees: " + Arrays.toString(tempArray));
        } else {
            System.out.println("Task 2 & 6. Salary of the new Employee is too small");
        }
    }

    // task 3. Создать метод, который позволяет уволить сотрудника из компании.


    public void removeEmployee(String name, String phone, long salary) {
        Employee deleteEmployee = new Employee(name, phone, salary);
        int newSize = employees.length - 1;
        int indexRemove = 0;
        Employee[] tempArray = new Employee[newSize];

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName()==deleteEmployee.getName() && employees[i].getPhone() == deleteEmployee.getPhone() && employees[i].getSalary() == deleteEmployee.getSalary()) {
            //if (employees[i].equals(deleteEmployee)) {
                indexRemove = i;
                break;
            }
        }
        if (indexRemove > 0) {
            System.arraycopy(employees, 0, tempArray, 0, indexRemove);
            System.arraycopy(employees, indexRemove + 1, tempArray, indexRemove, employees.length-indexRemove-1);
        } else {
            System.arraycopy(employees, 1, tempArray, 0, newSize);
        }
        employees = tempArray;

        System.out.println("Task 3. List of Employees without the deleted one(s): " + Arrays.toString(tempArray));
    }

}


