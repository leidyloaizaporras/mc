/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.estructuras;

/**
 *
 * @author SG702-09
 * @param <T>
 */
public class NodoLista<T> {
    private T element;
    private NodoLista<T> next;
    private NodoLista<T> prev;

    public NodoLista(T element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NodoLista<T> getNext() {
        return next;
    }

    public void setNext(NodoLista<T> next) {
        this.next = next;
    }

    public NodoLista<T> getPrev() {
        return prev;
    }

    public void setPrev(NodoLista<T> prev) {
        this.prev = prev;
    }
}
