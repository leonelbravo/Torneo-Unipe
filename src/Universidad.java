import java.util.ArrayList;

public class Universidad {

    public ArrayList<Jugador> titulares = new ArrayList<>();
    public ArrayList<Jugador> suplentes = new ArrayList<>();


    public void agregarJugadorTitular(Jugador j){
        titulares.add(j);
    }

    public void agregarJugadorSuplente(Jugador j){
        suplentes.add(j);
    }

    public ArrayList<Jugador> jugadoresZurdos (){
        ArrayList<Jugador> zurdos = new ArrayList<>();
        for (Jugador j : titulares){
            if(j.zurdo){
                zurdos.add(j);
            }
        }
        for (Jugador j : suplentes){
            if(j.zurdo){
                zurdos.add(j);
            }
        }
        return zurdos;
    }

    public String equipoSalvajeODefensivo() {
        int salvajes = 0;
        int defensores = 0;
        for (Jugador j : titulares) {
            if (j.esDelantero()) {
                salvajes++;
            } else {
                defensores++;
            }
        }
        if (salvajes > titulares.size() / 2) {
            return "Salvaje";
        } else if (defensores > titulares.size() / 2) {
            return "Impenetrable";
        } else {
            return "Balanceado";
        }
    }

    public boolean tieneArqueroTitular() {
        for (Jugador j : titulares) {
            if (j instanceof Arquero && j.altura >= 180) {
                return true;
            }
        }
        return false;
    }

    public boolean tieneArqueroSuplente() {
        for (Jugador j : suplentes) {
            if (j instanceof Arquero && j.altura >= 180) {
                return true;
            }
        }
        return false;
    }

}
