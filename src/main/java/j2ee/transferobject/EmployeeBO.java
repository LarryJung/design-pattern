package j2ee.transferobject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBO {
    List<EmployeeVO> employees;

    public EmployeeBO() {
        employees = new ArrayList<>();
        EmployeeVO david = new EmployeeVO(1, "David");
        EmployeeVO scott = new EmployeeVO(2, "Scott");
        EmployeeVO jessica = new EmployeeVO(3, "Jessica");
        employees.add(david);
        employees.add(scott);
        employees.add(jessica);
    }

    public void deleteEmployee(EmployeeVO employee) {
        employees.remove(employee.getEmployeeId());
        System.out.println("Employee with ID: " + employee.getEmployeeId() + " was successfully deleted.");
    }

    public List<EmployeeVO> getAllEmployees() {
        return employees;
    }

    public EmployeeVO getEmployee(int id) {
        return employees.get(id);
    }

    public void updateEmployee(EmployeeVO employee) {
        employees.get(employee.getEmployeeId()).setName(employee.getName());
        System.out.println("Employee with ID: " + employee.getEmployeeId() + " successfully updated.");
    }
}
