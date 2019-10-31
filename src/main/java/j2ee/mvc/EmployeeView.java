package j2ee.mvc;

public class EmployeeView {
    public void printEmployeeInformation(String employeeName, int employeeId) {
        System.out.println("Employee information: ");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
    }
}
