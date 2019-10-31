package j2ee.dao;

public class Employee {
    private int employeeId;
    private String name;

    public Employee(int id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int id) {
        this.employeeId = id;
    }
    public String getName() {
        return name;
    }
    public void setEmployeeName(String name) {
        this.name = name;
    }
}
