public class EmployeeBook {

    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void printAll() {
        for (Employee employee: this.employees) {
            System.out.println(employee.toString());
        }
    }

    public double totalSalary() {
        double total = 0;
        for (Employee employee: this.employees) {
            total = total + employee.getSalary();
        }

        return total;
    }

    public Employee minSalaryEmployee() {
        Employee employeeWithMinSalary = this.employees[0];
        for (Employee employee: this.employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee maxSalaryEmployee() {
        Employee employeeWithMaxSalary = this.employees[0];
        for (Employee employee: this.employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public double middleSalary() {
        return totalSalary() / this.employees.length;
    }

    public void namesToString() {
        for (Employee employee: this.employees) {
            System.out.println("Фамилия: " + employee.getSurname() + " Имя: " + employee.getName() + " Отчество: " + employee.getPatronymic());
        }
    }

    public void salaryIndexation(int percent) {
        for (Employee employee: this.employees) {
            employee.setSalary(employee.getSalary() + ((employee.getSalary() * percent) / 100));
        }
    }

    public Employee minSalaryEmployeeFromDepartment(int department) {
        Employee employeeWithMinSalary = this.employees[0];
        for (Employee employee: this.employees) {
            if (employee.getDepartment() == department && employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee maxSalaryEmployeeFromDepartment(int department) {
        Employee employeeWithMaxSalary = this.employees[0];
        for (Employee employee: this.employees) {
            if (employee.getDepartment() == department && employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public double totalSalaryForDepartment(int department) {
        double total = 0;
        for (Employee employee: this.employees) {
            if (employee.getDepartment() == department) {
                total = total + employee.getSalary();
            }
        }

        return total;
    }

    public int totalEmployeesInDepartment(int department) {
        int total = 0;
        for (Employee employee: this.employees) {
            if (employee.getDepartment() == department) {
                total++;
            }
        }
        return total;
    }

    public double middleSalaryForDepartment(int department) {
        return totalSalaryForDepartment(department) / totalEmployeesInDepartment(department);
    }

    public void salaryIndexationForDepartment(int department, int percent) {
        for (Employee employee: this.employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + ((employee.getSalary() * percent) / 100));
            }
        }
    }

    public String employeeToString(Employee employee) {
        return "Табельнй номер: " +
                employee.getId() +
                ", ФИО: " +
                employee.getSurname() + " " +
                employee.getName() + " " +
                employee.getPatronymic()+
                ", зварплата: " + employee.getSalary();
    }

    public void departmentToString(int department) {
        for (Employee employee: this.employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employeeToString(employee));
            }
        }
    }

    public void employeesWithSalaryLowerThen(double salary) {
        for (Employee employee: this.employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employeeToString(employee));
            }
        }
    }

    public void employeesWithSalaryHigherThen(double salary) {
        for (Employee employee: this.employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employeeToString(employee));
            }
        }
    }

    public void addEmployee(String name, String surname, String patronymic, int department, double salary) {
        Employee newEmployee = new Employee(name, surname, patronymic, department, salary);
        for (Employee employee: this.employees) {
            if (employee == null) {
                employee = newEmployee;
            }
        }
    }

    public void deleteEmployeeByName(String surname, String name, String patronymic, int id) {
        for (Employee employee: this.employees) {
            if (
                    employee.getName().equals(name)
                    && employee.getPatronymic().equals(patronymic)
                    && employee.getSurname().equals(surname)
                    && employee.getId() == id
            ) {
                employee = null;
            }
        }
    }

    public void deleteEmployeeById(int id) {
        for (Employee employee: this.employees) {
            if (employee.getId() == id) {
                employee = null;
            }
        }
    }

    public void salaryIndexationForEmployee(String surname, String name, String patronymic, int percent) {
        for (Employee employee: this.employees) {
            if (
                    employee.getName().equals(name)
                    && employee.getPatronymic().equals(patronymic)
                    && employee.getSurname().equals(surname)
            ) {
                employee.setSalary(employee.getSalary() + ((employee.getSalary() * percent) / 100));
            }
        }
    }

    public void departmentChangeForEmployee(String surname, String name, String patronymic, int department) {
        for (Employee employee: this.employees) {
            if (
                    employee.getName().equals(name)
                    && employee.getPatronymic().equals(patronymic)
                    && employee.getSurname().equals(surname)
            ) {
                employee.setDepartment(department);
            }
        }
    }

    public String employeeFullName(Employee employee) {
        return employee.getSurname() + " " +
                employee.getName() + " " +
                employee.getPatronymic();
    }

    public void departmentFullNames(int department) {
        for (Employee employee: this.employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employeeFullName(employee));
            }
        }
    }

    public void printDepartmentsEmployees() {
        for (int i = 1; i <= 5; i++) {

            System.out.println("Отдел: " + i);
            departmentFullNames(i);
        }
    }
}
