/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;

/**
 *
 * @author SG702-09
 */
public class Pedido <T> {
    private String horaPedido;
    private Producto<T> producto;
    private String direccion;
    private boolean esDomicilio;

    public Pedido(String horaPedido, Producto<T> producto) {
        this.horaPedido = horaPedido;
        this.producto = producto;
        this.direccion = "";
        this.esDomicilio = false;
    }

    public Pedido(String horaPedido, Producto<T> producto, String direccion) {
        this.horaPedido = horaPedido;
        this.producto = producto;
        this.direccion = direccion;
        this.esDomicilio = true;
    }

    Pedido(AdministracionMcDonalds.Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public Producto<T> getProducto() {
        return producto;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean esDomicilio() {
        return esDomicilio;
    }

    @Override
    public String toString() {
        return "Pedido [horaPedido=" + horaPedido + ", producto=" + producto + ", direccion=" + direccion
                + ", esDomicilio=" + esDomicilio + "]";
    }
}      
    
 
            