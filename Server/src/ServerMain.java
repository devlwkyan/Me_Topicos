public class ServerMain {
    public static void main(String[] args) {
        int port = Integer.parseInt( args[0] );
        Server server = new Server(  port );
        server.start();
    }
}
