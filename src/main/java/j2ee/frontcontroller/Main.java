package j2ee.frontcontroller;

public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("MAIN");
        frontController.dispatchRequest("EMPLOYEE");
    }
}
