package lab8.leonardobanegas;

import java.util.ArrayList;

public class Clientes {
    private String nombre;
    private String cuenta;
    private String contrasena;
    private ArrayList<Producto> productos = new ArrayList();
    private String numidentidad;
    private int saldodisponible;

    public Clientes(String nombre, String cuenta, String contrasena, String numidentidad, int saldodisponible) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contrasena = contrasena;
        this.numidentidad = numidentidad;
        this.saldodisponible = saldodisponible;
    }

    public Clientes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getNumidentidad() {
        return numidentidad;
    }

    public void setNumidentidad(String numidentidad) {
        this.numidentidad = numidentidad;
    }

    public int getSaldodisponible() {
        return saldodisponible;
    }

    public void setSaldodisponible(int saldodisponible) {
        this.saldodisponible = saldodisponible;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", contrasena=" + contrasena + ", productos=" + productos + ", numidentidad=" + numidentidad + ", saldodisponible=" + saldodisponible + '}';
    }
    
}
