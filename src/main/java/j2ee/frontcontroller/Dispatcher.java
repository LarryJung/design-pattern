package j2ee.frontcontroller;

public class Dispatcher {
    private MainView mainView;
    private EmployeeView employeeView;

    public Dispatcher() {
        mainView = new MainView();
        employeeView = new EmployeeView();
    }

    public void dispatch(String request) {
        if(request.equalsIgnoreCase("EMPLOYEE")) {
            employeeView.showView();
        } else {
            mainView.showView();
        }
    }
}
