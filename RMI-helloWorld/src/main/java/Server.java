import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {

    public Server() {
    }

    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String args[]) {

        try {
            Server server = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(server, 1099);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}