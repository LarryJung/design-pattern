package j2ee.servicelocator;

public class InitialContext {
    public Object lookup(String jndiName) {
        if(jndiName.equalsIgnoreCase("EmployeeService")) {
            System.out.println("Looking up and initializing Employee Service...");
            return new EmployeeService();
        } else if(jndiName.equalsIgnoreCase("CustomerService")) {
            System.out.println("Looking up and initializing Customer Service...");
            return new CustomerService();
        }
        return null;
    }
}
