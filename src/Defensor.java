public class Defensor extends Jugador {
    public Defensor(String nombre, String apellido, int altura, boolean zurdo, int fuerzaTiro) {
        super(nombre, apellido, altura, zurdo, fuerzaTiro);
    }

    public double precision = 4;

    @Override
    public double precisionAlArco() {
        return precision;
    }

    @Override
    public int habilidadDefensiva() {
        return 8;
    }

    public boolean esDelantero() {
        return false;
    }
}
