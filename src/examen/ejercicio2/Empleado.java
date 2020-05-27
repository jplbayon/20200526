package examen.ejercicio2;

import java.util.Date;

public abstract class Empleado implements Comparable<Empleado> {
	private String nombre;
	private String apellidos;
	private Date fecha;
	private double salario;
	private String cuenta;
		
	
	public Empleado(String nombre, String apellidos, Date fecha, double salario, String cuenta) {
		if (salario < 0) throw new SalarioException("Imposible salario negativo: " +  salario);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.salario = salario;
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Date getFecha() {
		return fecha;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		if (salario < 0) throw new SalarioException("Imposible salario negativo: " +  salario);
        this.salario = salario;
    }
	
	public String getCuenta() {
		return cuenta;
	}
	
	public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
	
	public String getEmpleado() {
		return apellidos+nombre;
	}
	

	@Override
	public String toString() {
		return "[" + nombre + ", " + apellidos + ", " + fecha + ", " + salario + "]";
	}
	
	@Override
	public final int compareTo(Empleado e) {
		return getEmpleado().compareTo(e.getEmpleado());
	}
	
}


