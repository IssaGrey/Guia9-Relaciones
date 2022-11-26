import Entidad.Perro;
import Entidad.Persona;

public class Main {
    public static void main(String[] args) {

        Perro mascota1 = new Perro();
        mascota1.setNombre("lupe");
        mascota1.setRaza("chiguagua");
        mascota1.setTamano("Small");
        Persona pax1 = new Persona("Samuel Issa",4, 1095695,mascota1);
        Persona pax2 = new Persona("Anwar Issa", 42 , 10187715,new Perro("lila","labrador", "big") );

        System.out.println("LAS MASCOTAS ASIGNADAS ");
        System.out.println(pax1.toString() + pax2.toString());


    }
}