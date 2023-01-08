import java.util.Arrays;

public class Main {


    public static void main(String [] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 120000);
        employees[1] = new Employee("Васильев", "Василий", "Васильевичч", 2, 130000);
        employees[2] = new Employee("Петров", "Петр", "Петрович", 3, 70000);
        employees[3] = new Employee("Сидоров", "Иван", "Иванович", 4, 95000);
        employees[4] = new Employee("Тестеров", "Тестер", "Тестерович", 5, 145000);
        employees[5] = new Employee("Иванова", "Иванна", "Ивановна", 1, 123000);
        employees[6] = new Employee("Васильева", "Василиса", "Васильевна", 2, 150000);
        employees[7] = new Employee("Сидорова", "Сидора", "Сидоровна", 3, 100000);
        employees[8] = new Employee("Петрова", "Петра", "Петровна", 4, 185000);
        employees[9] = new Employee("Тестерова", "Теста", "Тестеровна", 5, 110000);

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.setEmployees(employees);

        employeeBook.printAll();

        System.out.println(employeeBook.totalSalary());

        System.out.println(employeeBook.minSalaryEmployee());

        System.out.println(employeeBook.maxSalaryEmployee());

        System.out.println(employeeBook.middleSalary());

        employeeBook.namesToString();

        employeeBook.salaryIndexation(10);

        System.out.println(employeeBook.minSalaryEmployeeFromDepartment(2));

        System.out.println(employeeBook.maxSalaryEmployeeFromDepartment(4));

        System.out.println(employeeBook.totalSalaryForDepartment(4));

        System.out.println(employeeBook.totalEmployeesInDepartment(4));

        System.out.println(employeeBook.middleSalaryForDepartment(4));

        employeeBook.salaryIndexationForDepartment(4, 15);

        employeeBook.departmentToString(4);

        employeeBook.employeesWithSalaryLowerThen(120000);

        employeeBook.employeesWithSalaryHigherThen(120000);

        employeeBook.deleteEmployeeByName("Петров", "Петр", "Петрович", 3);

        employeeBook.deleteEmployeeById(9);

        employeeBook.addEmployee("Петровя", "Петря", "Петровичя", 3, 125000);

        employeeBook.addEmployee("Петрову", "Петру", "Петровичу", 4, 165000);

        employeeBook.salaryIndexationForEmployee("Петрову", "Петру", "Петровичу", 4);

        employeeBook.departmentChangeForEmployee("Петрову", "Петру", "Петровичу", 3);

        employeeBook.printDepartmentsEmployees();
    }

}