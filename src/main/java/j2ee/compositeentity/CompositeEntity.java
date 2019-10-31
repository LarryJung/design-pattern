package j2ee.compositeentity;

public class CompositeEntity {

    // 굳이 한단 계 더 추상화를 해야할 필요가 있었을까?
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String jobSuccess, String satisfaction) {
        cgo.setData(jobSuccess, satisfaction);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
