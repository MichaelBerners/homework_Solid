package dip;

public class Client {

    private Server server; //зависимость через абстракцию

    public Client(Server server) {
        this.server = server;
    }

    @Override
    public String toString() {
        return server.getServer();
    }
}
