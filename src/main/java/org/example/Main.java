package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sucursal sucursal1 = new Sucursal("Coso");
        Sucursal sucursal2 = new Sucursal("Coso2");
        String[] ciudades1 = ManejadorArchivosGenerico.leerArchivo("src\\main\\java\\org\\example\\sucursales.txt");
        String[] ciudades2 = ManejadorArchivosGenerico.leerArchivo("src\\main\\java\\org\\example\\suc2.txt");
        String[] ciudades3 = ManejadorArchivosGenerico.leerArchivo("src\\main\\java\\org\\example\\suc3.txt");

        for (String cuidad : ciudades1) {
            sucursal1.agregarSucursal(new Sucursal(cuidad));
        }
        System.out.println("Cantidad de sucursales: " + sucursal1.sucursales.size());
        System.out.println( Arrays.toString(sucursal1.listarSucursal()));
        sucursal1.eliminarSucursal("Chicago");
        System.out.println(Arrays.toString(sucursal1.listarSucursal()));

        for (String cuidad : ciudades2) {
            sucursal1.eliminarSucursal(cuidad);
        }
        System.out.println(Arrays.toString(sucursal1.listarSucursal()));

        for (String cuidad : ciudades3) {
            sucursal2.agregarSucursal(new Sucursal(cuidad));
        }
        System.out.println(sucursal2.imprimirConSeprador(";_"));


    }
}