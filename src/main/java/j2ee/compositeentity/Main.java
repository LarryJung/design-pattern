package j2ee.compositeentity;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Successful", "Satisfied");
        client.print();
        client.setData("Failed", "Unsatisfied");
        client.print();
    }
}
