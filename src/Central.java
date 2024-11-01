public class Central extends Jugador {
    public Central(String nombre, String apellido, int altura, boolean zurdo, int fuerzaTiro) {
        super(nombre, apellido, altura, zurdo, fuerzaTiro);
    }
    public double precision = 6;

    @Override
    public double precisionAlArco() {
        return precision;
    }

    @Override
    public int habilidadDefensiva() {
        return 4;
    }

}
