public class Arquero extends Jugador {

    public Arquero(String nombre, String apellido, int altura, boolean zurdo, int fuerzaTiro) {
        super(nombre, apellido, altura, zurdo, fuerzaTiro);
    }
    public double precision = 2;

    @Override
    public double precisionAlArco() {
        return precision;
    }

    @Override
    public int habilidadDefensiva() {
        return 10;
    }

    public boolean esDelantero() {
        return false;
    }

}
