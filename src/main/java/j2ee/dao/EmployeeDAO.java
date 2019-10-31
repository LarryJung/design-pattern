package j2ee.dao;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void addEmployee(Employee e);
    public void updateEmployee(Employee e);
    public void deleteEmployee(Employee e);
}
