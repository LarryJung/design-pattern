package j2ee.businessdelegate;

public class Main {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.process();

        businessDelegate.setServiceType("JMS");
        client.process();
    }
}
