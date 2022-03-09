public interface EstadoTCP {

    void enviarMensaje(String mensaje);
    void recibirMensaje(String mensaje);
    void cerrarCliente();
    void abrirTCP();
}
