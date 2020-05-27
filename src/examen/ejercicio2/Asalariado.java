package examen.ejercicio2;

import java.util.Date;

public class Asalariado extends Empleado {

	private String departamento;
	
	public Asalariado(String nombre, String apellidos, Date fecha, double salario, String cuenta, String departamento) {
		super(nombre,apellidos, fecha, salario, cuenta);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}


	@Override
	public String toString() {
		return super.toString()+" "+departamento;
	}
	
}