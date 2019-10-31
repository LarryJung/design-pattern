package j2ee.dao;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    List<Employee> employeeList;

    public EmployeeDAOImpl() {
        employeeList = new ArrayList<Employee>();
        Employee david = new Employee(5, "David");
        Employee scott = new Employee(7, "Scott");
        Employee jessica = new Employee(12, "Jessica");
        Employee rebecca = new Employee(16, "Rebecca");
        employeeList.add(david);
        employeeList.add(scott);
        employeeList.add(jessica);
        employeeList.add(rebecca);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
    @Override
    public Employee getEmployeeById(int id) {
        return employeeList.get(id);
    }
    @Override
    public void addEmployee(Employee e) {
        employeeList.add(e);
        System.out.println("Successfully added " + e.getName());
    }
    @Override
    public void updateEmployee(Employee e) {
        employeeList.get(e.getEmployeeId()).setEmployeeName(e.getName());
        System.out.println("Successfully update name of employee with id: " + e.getEmployeeId());
    }
    @Override
    public void deleteEmployee(Employee e) {
        employeeList.remove(e.getEmployeeId());
        System.out.println("Successfully removed employee: " + e.getName() + "with the ID: " + e.getEmployeeId());
    }
}
