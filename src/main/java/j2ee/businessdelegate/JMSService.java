package j2ee.businessdelegate;

public class JMSService implements BusinessService {
    @Override
    public void process() {
        System.out.println("Processing using the JSM Service.");
    }
}
