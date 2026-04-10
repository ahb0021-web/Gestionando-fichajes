import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Messi", LocalDate.of(1987, 6, 24), "Delantero");
        Jugador j2 = new Jugador("Pedri", LocalDate.of(2002, 11, 25), "Centrocampista");

        Entrenador e1 = new Entrenador("Pep Guardiola", "4-3-3");

        Equipo eq1 = new Equipo("Barcelona", e1);

        eq1.addJugador(j1);
        eq1.addJugador(j2);

        System.out.println(eq1);

    }
}
