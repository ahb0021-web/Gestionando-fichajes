public class Entrenador {

    private String nombre;
    private String formacionPreferida;

    public Entrenador(String nombre, String formacionPreferida) {
        this.nombre = nombre;
        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", formacionPreferida=" + formacionPreferida + "]";
    }
}