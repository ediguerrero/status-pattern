public class Cerrado implements EstadoTCP {
    private ClienteTCP clienteTCP;
    Cerrado (ClienteTCP clienteTCP){
        this.clienteTCP = clienteTCP;
    }

    public void abrirTCP(){
        this.clienteTCP.cambiarEstado(clienteTCP.abriendo());

    }

    public void enviarMensaje(String mensaje) {
        System.out.println("no se puede enviar en el estado cerrado");

    }

    public void recibirMensaje(String mensaje) {
        System.out.println("no se puede recibir mensajes en estado cerrado");

    }

    public void cerrarCliente() {
        System.out.println("cerrando cliente estado cerrado");
        clienteTCP.cambiarEstado(clienteTCP.cerrando());

    }


}
