package org.example;

import java.util.LinkedList;

public class Sucursal {
    public String Nombre;

    public LinkedList<Sucursal> sucursales = new LinkedList<Sucursal>();

    public Sucursal(String nombre) {
        this.Nombre = nombre;
    }

    public boolean agregarSucursal(Sucursal su){
        if(su != null){
            sucursales.add(su);
            return true;
        }
        return false;
    }

    public boolean eliminarSucursal(String su){
        for (Sucursal i : sucursales) {
            if(i.Nombre.equals(su)){
                sucursales.remove(i);
                return true;
            }
        }
        return false;
    }

    public Sucursal buscarSucursal(String su){
        for (Sucursal i : sucursales) {
            if(i.Nombre.equals(su)){
                return i;
            }
        }
        return null;
    }

    public String[] listarSucursal(){
        String[] listaSucursales = new String[sucursales.size()];
        for (int i = 0;  i < sucursales.size(); i++) {
            listaSucursales[i] = (sucursales.get(i).Nombre);
        }
        return listaSucursales;
    }

    public int cantidadSucursales(){
        return sucursales.size();
    }

    public boolean esVacia(){
        return sucursales.isEmpty();
    }

    public String imprimirConSeprador(String separador){
        StringBuilder lista = new StringBuilder();
        for (Sucursal i : sucursales) {
            lista.append(i.Nombre).append(separador);
        }
        return lista.toString();
    }

}
