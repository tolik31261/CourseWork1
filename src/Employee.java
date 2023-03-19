public class Employee {
    private static long idCounter = 0;
    private final long id;
    private String fullName;
    private int department;
    private double salary;

    public Employee() {
        this.id = idCounter++;
    }

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return fullName + ", ID - " + id + ", department - " + department + ", salary - " + salary;
    }
}
