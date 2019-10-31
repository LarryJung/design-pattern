package j2ee.interceptingfilter;

public class DebuggingFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Logging request: " + request);
    }
}
