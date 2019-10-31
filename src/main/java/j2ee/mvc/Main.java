package j2ee.mvc;

public class Main {
    public static void main(String[] args) {
        Employee employee = getEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        controller.updateView();

        controller.setEmployeeId(5);

        controller.updateView();
    }

    // simulating a database
    public static Employee getEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setEmployeeName("David");
        employee.setEmployeeId(1);
        return employee;
    }
}
