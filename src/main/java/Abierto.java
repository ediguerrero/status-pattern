public class Abierto implements EstadoTCP {
    private ClienteTCP clienteTCP;
    Abierto (ClienteTCP clienteTCP){
        this.clienteTCP = clienteTCP;
    }

    public void enviarMensaje(String mensaje) {
        System.out.println("Estado abierto: enviando mensaje " +mensaje);
        clienteTCP.cambiarEstado(clienteTCP.esperandoRespuesta());


    }

    public void recibirMensaje(String mensaje) {
        System.out.println("no puede recibir mensaje en estado abierto");

    }
    public void cerrarCliente() {
        System.out.println("cerrando cliente estado abierto");
        clienteTCP.cambiarEstado(clienteTCP.cerrando());

    }

    public void abrirTCP() {
        System.out.println("el estado ya se encuentra abierto");
    }


}
