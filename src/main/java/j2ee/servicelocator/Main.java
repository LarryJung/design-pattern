package j2ee.servicelocator;

public class Main {
    public static void main(String[] args) {
        Service service = Locator.getService("EmployeeService");
        service.execute();
        service = Locator.getService("CustomerService");
        service.execute();
    }
}
