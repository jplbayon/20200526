package examen.ejercicio2;

import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Contratista extends Empleado {

	private Set<Sociedad> sociedades = new TreeSet<>();
	
	public Contratista(String nombre, String apellidos, Date fecha, double salario, String cuenta, Collection<Sociedad> sociedades) {
		super(nombre,apellidos, fecha, salario, cuenta);
		this.sociedades.addAll(sociedades);
	}

	public Contratista(String nombre, String apellidos, Date fecha, double salario, String cuenta, Sociedad sociedad) {
		super(nombre,apellidos, fecha, salario, cuenta);
		sociedades.add(sociedad);
	}
	
	public Set<Sociedad> getSociedades() {
        return sociedades;
    }
	
	@Override
	public String toString() {
		return super.toString() + sociedades;
	}

	
	
}
