public class Employee {
   private String firstName;
   private String lastName;
   private String phone;
   private static int numberOfEmployees;

    public  Employee(String firstName, String lastName, String phone) {
        this.firstName =firstName;
        this.phone = phone;
        this.lastName = lastName;
        this.numberOfEmployees++;
    }
    public static int getNumberOfEmployee() {
        return numberOfEmployees;
    }
}
