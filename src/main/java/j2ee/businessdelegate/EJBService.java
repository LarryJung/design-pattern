package j2ee.businessdelegate;

public class EJBService implements BusinessService {
    @Override
    public void process() {
        System.out.println("Processing using the EJB Service.");
    }
}
