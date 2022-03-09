public class EsperandoRespuesta implements EstadoTCP {
    private ClienteTCP clienteTCP;

    EsperandoRespuesta(ClienteTCP clienteTCP) {
        this.clienteTCP = clienteTCP;
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("no puede enviar mensaje en estado esperando respuesta");

    }

    public void recibirMensaje(String mensaje) {
        System.out.println("Estado esperando respuesta: mensaje recibido " + mensaje);
        clienteTCP.cambiarEstado(clienteTCP.abriendo());
    }

    public void cerrarCliente() {
        System.out.println("cerrando cliente estado esperando respuesta");
        clienteTCP.cambiarEstado(clienteTCP.cerrando());

    }
    public void abrirTCP() {
        System.out.println("no se puede abrir tcp desde el estado esperando respuesta");
    }


}
