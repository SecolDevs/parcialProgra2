package models;

import java.util.ArrayList;

public class Comercial extends Embarque {
        private int total;
    private ArrayList<Pasajero> pasajeros;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
