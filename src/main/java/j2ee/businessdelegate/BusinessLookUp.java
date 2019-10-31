package j2ee.businessdelegate;

public class BusinessLookUp {
    public BusinessService getBusinessService(String type) {
        if (type.equalsIgnoreCase("ejb")) {
            return new EJBService();
        } else if (type.equalsIgnoreCase("JMS")) {
            return new JMSService();
        } else {
            return null;
        }
    }
}
