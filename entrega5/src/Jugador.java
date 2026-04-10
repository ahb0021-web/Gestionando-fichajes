import java.time.LocalDate;

public class Jugador {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String posicion;
    private boolean traspasoSolicitado;

    public Jugador(String nombre, LocalDate fechaNacimiento, String posicion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.traspasoSolicitado = false;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
                + ", posicion=" + posicion + ", traspasoSolicitado=" + traspasoSolicitado + "]";
    }
}
