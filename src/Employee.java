public class Employee {
    private String name;
    private String phone;
    private long salary;

    public Employee(String name, String phone, long salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
