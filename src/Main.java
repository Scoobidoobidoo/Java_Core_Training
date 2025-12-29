public class Main {
    // task 1 Создать метод, который выводит на экран имя сотрудника с самой большой зарплатой.
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "1232", 10000);
        Employee employee2 = new Employee("Stas", "14545", 10000);
        Employee employee3 = new Employee("Dmytro", "5545", 10000);
        Company gl = new Company("GL", "Hrinchenka", "4545", new Employee[]{employee1, employee2, employee3});
        gl.printMaxSalaryEmployeeName();

        // task 4 Создать метод, который выводит на экран размер затрат на зарплату.
        gl.printTotalSalary();

        // task 5 Создать метод, который выводит на экран среднюю зарплату в компании.
        gl.printMediumSalary();

        //task 2 Создать метод, который позволяет добавить нового сотрудника
        //task 6 При добавлении нового сотрудника проверять не является ли его зарплата ниже разрешенной.

        gl.addEmployee("Den", "123123123", 100500);
        gl.addEmployee("Random", "123123123", 100);

        // task 3. Создать метод, который позволяет уволить сотрудника из компании.

        gl.removeEmployee("Dmytro", "5545", 10000);
    }
}
