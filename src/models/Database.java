package models;

import java.util.ArrayList;

public class Database {

    private ArrayList<Producto> productos;
    private ArrayList<Pasajero> pasajeros;
    private ArrayList<Comercial> comercials;

    public Database() {
        productos = new ArrayList<Producto>();
        pasajeros = new ArrayList<Pasajero>();
        comercials = new ArrayList<Comercial>();
    }

    public void addDatos(Producto producto) {
        productos.add(producto);
    }

    public void addDatos(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public void addDatos(Comercial comercial) {
        comercials.add(comercial);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public ArrayList<Comercial> getComercials() {
        return comercials;
    }

    public void setComercials(ArrayList<Comercial> comercials) {
        this.comercials = comercials;
    }

    public int getTotalPasajeros() {
        return pasajeros.size();
    }

    public int getTotalProductos() {
        return productos.size();
    }

    public int getTotalComercial() {
        return comercials.size();
    }

}
