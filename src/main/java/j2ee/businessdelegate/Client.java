package j2ee.businessdelegate;

public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void process() {
        businessDelegate.process();
    }
}
