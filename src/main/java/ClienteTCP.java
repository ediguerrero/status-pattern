public class ClienteTCP {

    private final EstadoTCP cerrado;
    private final EstadoTCP abierto;
    private final EstadoTCP esperandoRespuesta;

    private EstadoTCP estadoActual;

    ClienteTCP() {

        cerrado = new Cerrado(this);
        abierto = new Abierto(this);
        esperandoRespuesta = new EsperandoRespuesta(this);
        estadoActual = cerrado;
        estadoActual.abrirTCP();

    }

    public void cambiarEstado(EstadoTCP nuevoEstadoTCP) {
        this.estadoActual = nuevoEstadoTCP;
    }

    public void enviarMensaje(String mensaje) {
        estadoActual.enviarMensaje(mensaje);
    }

    public void recibirMensaje(String mensaje) {
        estadoActual.recibirMensaje(mensaje);
    }

    public void cerrarCliente() {
        estadoActual.cerrarCliente();
    }

    public EstadoTCP cerrando() {
        return cerrado;
    }

    public EstadoTCP abriendo() {
        return abierto;
    }

    public EstadoTCP esperandoRespuesta() {
        return esperandoRespuesta;
    }
}
