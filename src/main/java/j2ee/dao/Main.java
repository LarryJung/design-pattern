package j2ee.dao;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDao = new EmployeeDAOImpl();

        for(Employee employee : employeeDao.getAllEmployees()) {
            System.out.println("Employee info: |Name: " + employee.getName() + ", ID: " + employee.getEmployeeId() + "|");
        }
    }
}
