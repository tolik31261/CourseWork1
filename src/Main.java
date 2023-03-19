import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Назаров Анатолий Сергеевич", 1, 100_000);
        employees[1] = new Employee("Ахметшина Анжела Александровна", 2, 98_000);
        employees[2] = new Employee("Александров Андрей Викторович", 5, 23_000);
        employees[3] = new Employee("Шустова Виолетта Юрьевна", 3, 38_000);
        employees[4] = new Employee("Васнецов Илья Васильевич", 4, 74_000);
        employees[5] = new Employee("Шурков Сергей Геннадьевич", 1, 51_000);
        employees[6] = new Employee("Суриков Иван Иванович", 2, 56_000);
        employees[7] = new Employee("Шерементьев Руслан Николаевич", 4, 20_000);
        employees[8] = new Employee("Гунько Илья Валерьевич", 5, 40_000);
        employees[9] = new Employee("Дымов Юрий Юрьевич", 2, 11_000);

        printAll();
        System.out.println("Сумма затрат на зп в месяц " + getSumSalary());

        Employee employeeMaxSalary = getEmployeeMaxSalary();
        System.out.println("Сотрудник с максимальной зп - " + getEmployeeMaxSalary());

        Employee employeeMinSalary = getEmployeeMinSalary();
        System.out.println("Сотрудник с минимальной зп - " + getEmployeeMinSalary());

        System.out.println("Cредняя зп составляет - " + getAverageSalary());

        printAllFullName();

    }

    private static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double getSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee getEmployeeMaxSalary() {
        Employee maxEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    private static Employee getEmployeeMinSalary() {
        Employee minEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    private static double getAverageSalary() {
        double average = 0;
        for (Employee employee : employees) {
            average += employee.getSalary() / employees.length;
        }
        return average;
    }

    public static void printAllFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}
