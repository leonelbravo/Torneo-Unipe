public class Delantero extends Jugador{
    public Delantero(String nombre, String apellido, int altura, boolean zurdo, int fuerzaTiro) {
        super(nombre, apellido, altura, zurdo, fuerzaTiro);
    }

    public double precision = 10;

    @Override
    public double precisionAlArco() {
        return precision;
    }

    @Override
    public int habilidadDefensiva() {
        return 2;
    }

}
