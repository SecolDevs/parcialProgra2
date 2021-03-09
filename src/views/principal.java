package views;

import controller.Controlador;

import java.util.Scanner;

public class principal {
    public Scanner sc = new Scanner(System.in);
    public Controlador controlador = new Controlador();

    public static void main(String[] args) {
        new principal().init();
    }

    public void init() {
        menu();
    }

    public void menu() {
        boolean condit = false;
        while (!condit) {
            System.out.println("Seleccione una Opcion:");
            System.out.println("1. Agregar Vuelo Comercial");
            System.out.println("2. Agregar Pasajeros");
            System.out.println("3. Agregar Productos");
            System.out.println("4. Ver Pasajeros");
            System.out.println("5. Ver Productos");
            System.out.println("6. Ver Vuelos Comerciales");
            System.out.println("7. Salir");
            switch (sc.nextInt()) {
                case 1:
                    addVueloComercial();
                    break;
                case 2:
                    addPersonas();
                    break;
                case 3:
                    addProductos();
                    break;
                case 4:
                    verPasajeros();
                    break;
                case 5:
                    verProductos();
                    break;
                case 6:
                    verComerciales();
                case 7:
                    condit = true;
                    break;
                default:
                    System.out.println("No ha seleccionado un numero valido");
                    menu();
                    break;
            }
        }
    }

    public void addVueloComercial() {
        System.out.println("Insertar Vuelo Comercial");
        System.out.println("Fecha");
        String fecha = sc.next();
        System.out.println("Origen");
        String origen = sc.next();
        System.out.println("Destino");
        String destino = sc.next();

        controlador.addComercial(fecha, origen, destino);
    }

    public void addVueloCarga() {
        System.out.println("Insertar Vuelo de Carga");
    }

    public void addPersonas() {
        System.out.println("Insertar Pasajeros del vuelo");
        System.out.println("Nombres Completos");
        String nombre = sc.next();
        System.out.println("Documento");
        int documento = sc.nextInt();
        System.out.println("Edad");
        int edad = sc.nextInt();
        System.out.println("Distancia");
        int distancia = sc.nextInt();
        System.out.println("Descuento");
        int descuento = sc.nextInt();
        System.out.println("Total del tiquete");
        int total = sc.nextInt();
        controlador.addPersona(documento, distancia, edad, descuento, total, nombre);
    }

    public void addProductos() {
        System.out.println("Insertar Productos para el vuelo");
        System.out.println("Nombre");
        String nombre = sc.next();
        System.out.println("Peso");
        int peso = sc.nextInt();

        controlador.addProducto(nombre, peso);
    }

    public void verPasajeros() {
        System.out.println("0--0--0--0--0");
        System.out.println(controlador.getPersonas());
    }

    public void verProductos() {
        System.out.println("0--0--0--0--0");
        System.out.println(controlador.getProductos());
    }

    public void verComerciales(){
        System.out.println("0--0--0--0--0");
        System.out.println(controlador.getComercials());
    }
}
