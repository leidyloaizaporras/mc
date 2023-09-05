/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.estructuras;

import co.edu.unipiloto.estdatos.colas.mundo.AdministracionMcDonalds;
import java.util.Iterator;

/**
 *
 * @author SG702-09
 * @param <T>
 */
public class ListaDobleEncadenada<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamaño;

   
    public ListaDobleEncadenada() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public Iterator<AdministracionMcDonalds.Pedido> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    private static class Nodo<T> {
        T elemento;
        Nodo<T> anterior;
        Nodo<T> siguiente;

        public Nodo(T elemento, Nodo<T> anterior, Nodo<T> siguiente) {
            this.elemento = elemento;
            this.anterior = anterior;
            this.siguiente = siguiente;
        }
    }


    public int size() {
        return tamaño;
    }

    
    public boolean isEmpty() {
        return tamaño == 0;
    }

    
    public void addFirst(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento, null, primero);
        if (isEmpty()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            primero.anterior = nuevoNodo;
            primero = nuevoNodo;
        }
        tamaño++;
    }

    
    public void addLast(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento, ultimo, null);
        if (isEmpty()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
        tamaño++;
    }

 
    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        if (size() == 1) {
            primero = null;
            ultimo = null;
        } else {
            primero = primero.siguiente;
            primero.anterior = null;
        }
        tamaño--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        if (size() == 1) {
            primero = null;
            ultimo = null;
        } else {
            ultimo = ultimo.anterior;
            ultimo.siguiente = null;
        }
        tamaño--;
    }

    
    public T first() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        return primero.elemento;
    }

   
    public T last() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista está vacía");
        }
        return ultimo.elemento;
    }
}
