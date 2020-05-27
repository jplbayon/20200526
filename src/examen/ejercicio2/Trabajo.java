package examen.ejercicio2;

public class Trabajo {
    private String nombre;
    private String servicio;
    private int importe;
    private String cuenta;

    public Trabajo(String nombre, String servicio, int importe, String cuenta) {
       
    	if (importe < 0) throw new ImporteMensualException("Imposible importe negativo: " + importe);
        this.nombre = nombre;
        this.servicio = servicio;
        this.importe = importe;
        this.cuenta = cuenta;
    }

    public int getImporte() {
        return importe;
    }
    
    public void setImporte(int importe) {
        if (importe < 0) throw new ImporteMensualException("Imposible importe negativo: " + importe);
        this.importe = importe;
    }

    public String getNombre() {
        return nombre;
    }

    public String getServicio() {
        return servicio;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }


    @Override
    public String toString() {
    	return "[" + nombre + ", " + servicio + ", " + importe + "]";
    }
}
