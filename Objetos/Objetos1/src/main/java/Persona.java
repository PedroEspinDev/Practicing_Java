import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String Ciudad;
    private LocalDate fechaNacimiento;

    private boolean trabajando;
    private boolean estudiando;

    public Persona(String nombre, String apellido, int edad, LocalDate fechaNacimiento, String Ciudad, boolean trabajando, boolean estudiando) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.Ciudad = Ciudad;
        this.trabajando = trabajando;
        this.estudiando = estudiando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isTrabajando() {
        return trabajando;
    }

    public void setTrabajando(boolean trabajando) {
        this.trabajando = trabajando;
    }

    public boolean isEstudiando() {
        return estudiando;
    }
    public void setEstudiando(boolean estudiando) {
        this.estudiando = estudiando;
    }
    /*
    Cada operador ternario se evalúa en orden y devuelve el valor correspondiente si su condición es verdadera.
    Si trabajando y estudiando son true, devuelve la primera cadena, si no sigue comparando, de tal forma que,
    Si la primera condición es false y trabajando devuelve su cadena y del mismo modo con estudiando.
     */
    public String obtenerEstadoActual() {
        return (trabajando && estudiando) ? "Estoy trabajando y estudiando."
                : (trabajando) ? "Estoy trabajando."
                : (estudiando) ? "Estoy estudiando."
                : "No estoy trabajando ni estudiando actualmente.";
    }

}
