public class Manager {

    private  EstadoTCP cerrado;
    private  EstadoTCP abierto;
    private  EstadoTCP esperandoRespuesta;

    private EstadoTCP estadoActual;

    public Manager(EstadoTCP estadoActual) {
       // cerrado = new Cerrado(this);
        //abierto = new Abierto(this);
       // esperandoRespuesta = new EsperandoRespuesta(this);
        //estadoActual = cerrado;

    }
    public EstadoTCP cambiarEstado(EstadoTCP nuevoEstadoTCP) {
        return nuevoEstadoTCP;
    }

    public EstadoTCP abriendo() {
        return abierto;
    }

    public EstadoTCP cerrando() {
        return cerrado;
    }

    public EstadoTCP esperandoRespuesta() {
        return esperandoRespuesta;
    }
}
