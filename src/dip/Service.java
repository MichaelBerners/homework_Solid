package dip;

public class Service {
    public static void main(String[] args) {
        Client client = new Client(new DbServerImp());
        System.out.println(client.toString());
    }
}
