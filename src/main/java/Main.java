public class Main {
    public static void main(String[] args) {
        ClienteTCP clienteTCP = new ClienteTCP();
        clienteTCP.enviarMensaje("hola mundo");
        clienteTCP.recibirMensaje("ACK");
        clienteTCP.enviarMensaje("hola mundo2");
        clienteTCP.recibirMensaje("ACK2");
        clienteTCP.cerrarCliente();
    }
}
