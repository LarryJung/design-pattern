package j2ee.compositeentity;

public class CoarseGrainedObject {
    Employee employee = new Employee();
    Manager manager = new Manager();

    public void setData(String jobSuccess, String satisfaction) {
        employee.setJobSuccess(jobSuccess);
        manager.setSatisfaction(satisfaction);
    }

    public String[] getData() {
        return new String[] {"Employee : " + employee.getJobSuccess(),"Manager: " +
                manager.getSatisfaction()};
    }
}
