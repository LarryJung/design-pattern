package j2ee.transferobject;

public class Main {
    public static void main(String[] args) {
        EmployeeBO employeeBo = new EmployeeBO();

        for(EmployeeVO employee : employeeBo.getAllEmployees()) {
            System.out.println("Employee: |" + employee.getName() + ", ID: " + employee.getEmployeeId() + "|");
        }

        EmployeeVO employee = employeeBo.getAllEmployees().get(0);
        employee.setName("Andrew");
        employeeBo.updateEmployee(employee);

        employee = employeeBo.getEmployee(0);
        System.out.println("Employee: |" + employee.getName() + ", ID: " + employee.getEmployeeId() + "|");

    }
}
