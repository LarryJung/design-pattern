package j2ee.compositeentity;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void print() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println(compositeEntity.getData()[i]);
        }
    }

    public void setData(String jobSuccess, String satisfaction) {
        compositeEntity.setData(jobSuccess, satisfaction);
    }
}
