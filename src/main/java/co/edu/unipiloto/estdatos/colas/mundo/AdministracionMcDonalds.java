package co.edu.unipiloto.estdatos.colas.mundo;

import co.edu.unipiloto.estdatos.colas.estructuras.Cola;
import co.edu.unipiloto.estdatos.colas.estructuras.ListaDobleEncadenada;
import java.util.Iterator;


	
public class AdministracionMcDonalds {

    private Cola<String> colaClientes;
    private ListaDobleEncadenada<Pedido> listaPedidos;
    private ListaDobleEncadenada<Producto> catalogoProductos;

    public class Producto {
        private String nombre;
        private long tiempoProceso;
        private int costo;

        public Producto(String nombre, long tiempoProceso, int costo) {
            this.nombre = nombre;
            this.tiempoProceso = tiempoProceso;
            this.costo = costo;
        }

        public String getNombre() {
            return nombre;
        }

        public long getTiempoProceso() {
            return tiempoProceso;
        }

        public int getCosto() {
            return costo;
        }
    }

    public AdministracionMcDonalds() {
        colaClientes = new Cola<String>();
        listaPedidos = new ListaDobleEncadenada<Pedido>();
        catalogoProductos = new ListaDobleEncadenada<Producto>();

        // Agregar productos al catálogo
        catalogoProductos.addLast(new Producto("Combo Nuggets", 200, 5));
        catalogoProductos.addLast(new Producto("Combo Big Mac", 300, 6));
        catalogoProductos.addLast(new Producto("Combo Cuarto de Libra", 250, 7));
        catalogoProductos.addLast(new Producto("McFlurry", 100, 3));
    }          

    public void agregarCliente(String nombre) {
        colaClientes.encolar(nombre);
    }  
 
    public String atenderCliente(String productoNombre) {
        Producto producto = buscarProducto(productoNombre);

        if (producto != null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Manejar la excepción si es necesario
            }

            Pedido pedido = new Pedido(producto);
            listaPedidos.addLast(pedido);
            return colaClientes.desencolar();
        } else {
            return "Producto no encontrado";
        }
    }

    public String entregarPedido() {
        Pedido pedido = listaPedidos.removeFirst();

        try {
            Thread.sleep(pedido.getProducto().getTiempoProceso());
        } catch (InterruptedException e) {
          
        }

        return pedido.getProducto().getNombre();
    }

    public int clientesEnFila() {
        return colaClientes.tamanio();
    }

    public int pedidosEnEspera() {
        return listaPedidos.size();
    }

    public Iterator<String> clientes() {
        return colaClientes.iterator();
    }

    public Iterator<Pedido> pedidos() {
        return listaPedidos.iterator();
    }

    public ListaDobleEncadenada<Producto> getCatalogoProductos() {
        return catalogoProductos;
    }

    private Producto buscarProducto(String nombre) {
        for (Producto producto : catalogoProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }
}
