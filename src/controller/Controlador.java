package controller;

import models.*;

import java.util.ArrayList;

public class Controlador {
    Database db = new Database();
    Pasajero pasajero;
    Producto producto;
    Comercial comercial;
    Carga carga;

    public void addPersona(int documento, int distancia, int edad, int descuento, int valorTiquete, String nombres) {
        pasajero = new Pasajero();
        pasajero.setDocumento(documento);
        pasajero.setDistancia(distancia);
        pasajero.setEdad(edad);
        pasajero.setDescuento(descuento);
        pasajero.setCostoTiquete(valorTiquete);
        pasajero.setNombres(nombres);

        db.addDatos(pasajero);
    }

    public void addProducto(String nombre, int peso) {
        producto = new Producto();
        producto.setNombre(nombre);
        producto.setPeso(peso);

        db.addDatos(producto);
    }

    public void addCarga() {

    }

    public void addComercial(String fecha, String origen, String destino) {
        comercial = new Comercial();
        comercial.setFecha(fecha);
        comercial.setOrigen(origen);
        comercial.setDestino(destino);
        db.addDatos(comercial);
    }

    public String getPersonas() {
        String texto = "";
        for (int i = 0; i < db.getTotalPasajeros(); i++) {
            texto += "Nombre: " + db.getPasajeros().get(i).getNombres() + " Documento: " + db.getPasajeros().get(i).getDocumento() + "\n";
        }
        return texto;
    }

    public String getProductos() {
        String texto = "";
        for (int i = 0; i < db.getTotalProductos(); i++) {
            texto += "Nombre: " + db.getProductos().get(i).getNombre() + " Peso: " + db.getProductos().get(i).getPeso() + "\n";
        }
        return texto;
    }

    public String getComercials() {
        String texto = "";
        for (int i = 0; i < db.getTotalComercial(); i++) {
            texto += "Fecha: " + db.getComercials().get(i).getFecha() + " Origen: " + db.getComercials().get(i).getTotal() + " Destino: " + db.getComercials().get(i).getDestino() + "\n";
        }
        return texto;
    }

}
