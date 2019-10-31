package j2ee.frontcontroller;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User has successfully authenticated.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Request: " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);

        if(isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}
