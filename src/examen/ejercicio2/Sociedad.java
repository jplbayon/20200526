package examen.ejercicio2;

import java.util.List;

public class Sociedad {
	private String nombre;
    private List<Trabajo> trabajos;

    public Sociedad(String nombre, List<Trabajo> trabajos) {
        this.nombre = nombre;
        this.trabajos = trabajos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Trabajo> getTrabajos() {
        return trabajos;
    }

    @Override
    public String toString() {
    	return "[" + nombre + ", " + trabajos + "]";
    }

}
