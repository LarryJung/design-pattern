package j2ee.businessdelegate;

public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String type;

    public void setServiceType(String type) {
        this.type = type;
    }

    public void process() {
        businessService = lookupService.getBusinessService(type);
        businessService.process();
    }
}
