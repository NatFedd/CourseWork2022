import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private double salary;
    private final long id = count;
    private static long count = 1L;

    boolean isDepartment(int department) {
        if (department >= 1 && department <= 5) {
            return true;
        }
        return false;
    }


    public Employee(String surname, String name, String patronymic, int department, double salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        if (isDepartment(department)) {
            this.department = department;
        } else {
            System.out.println("Данного отдела не существует");
        }
        this.salary = salary;
        count++;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Работник с табельным номером " +
                id +
                ", ФИО: " +
                surname + " " +
                name + " " +
                patronymic + " " +
                "работает в отделе " + department +
                ", получает зарплату " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, department, salary);
    }
}
