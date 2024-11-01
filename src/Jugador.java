public abstract class Jugador {
    public String nombre;
    public String apellido;
    public int altura;
    public boolean zurdo;
    public int fuerzaTiro;

    public Jugador (String nombre, String apellido, int altura, boolean zurdo, int fuerzaTiro){
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.zurdo = zurdo;
        this.fuerzaTiro = fuerzaTiro;
    }

    public abstract double precisionAlArco();
    public abstract int habilidadDefensiva();

    public boolean posibleArquero(){
        return this.altura >= 180;
    }

    public double chanceDeGol(){
        
       double chance =  0.5 * precisionAlArco() * (double) this.fuerzaTiro;
       if (this.zurdo){
           return chance * 1.2;
       } else {
           return chance;
       }
    }

    public double posibleGolDeCabeza(){
        return this.altura * precisionAlArco();
    }

}
