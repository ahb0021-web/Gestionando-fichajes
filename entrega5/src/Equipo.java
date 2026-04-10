import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, Entrenador entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador j) {
        jugadores.add(j);
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre +
                "\nEntrenador: " + entrenador +
                "\nJugadores: " + jugadores;
    }
}