/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;

/**
 *
 * @author SG702-09
 */
public class Producto <T> {
    private String nombre;
    private int tiempoPreparacion;
    private T costo;

    public Producto(String nombre, int tiempoPreparacion, T costo) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public T getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", tiempoPreparacion=" + tiempoPreparacion + ", costo=" + costo + "]";
    }

    long getTiempoProceso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }           
}

    

