public class Torneo {

    public Universidad universidad;
    public Jugador jugador;

    public Torneo(Universidad universidad) {
        this.universidad = universidad;
    }

    public int cantidadTotalZurdos() {

        return universidad.jugadoresZurdos().size();
    }


}
