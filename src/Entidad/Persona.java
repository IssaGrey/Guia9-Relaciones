package Entidad;

public class Persona {

    private String nombre;
    private Integer edad;
    private Integer documento;
    private Perro Mascota;

    public Persona(String nombre, Integer edad, Integer documento, Perro mascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        Mascota = mascota;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getMascota() {
        return Mascota;
    }

    public void setMascota(Perro mascota) {
        Mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona " +
                "Nombre='" + nombre + '\'' +
                "- Edad=" + edad +
                "- Documento=" + documento +
                "- Mascota=" + Mascota +"\n";

    }
}
