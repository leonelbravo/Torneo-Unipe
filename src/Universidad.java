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
                j.precisionAlArco();
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


}
