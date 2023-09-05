package co.edu.unipiloto.estdatos.colas.mundo;

import co.edu.unipiloto.estdatos.colas.estructuras.Cola;
import co.edu.unipiloto.estdatos.colas.estructuras.ListaDobleEncadenada;
import java.util.Iterator;



public class AdministracionMcDonalds{
	
	private Cola<String> colaClientes;
	private ListaDobleEncadenada<Pedido> listaPedidos;
	public enum Pedido{
		NUGGETS ("Combo Nuggets",200),
		BIGMAC ("Combo Bigmac", 300),
		CUARTO ("Combo Cuarto de Libra", 250),
		MCFLURRY ("McFlurry", 100);
	
		private final String nombre;
		private final long tiempoProceso;
		private Pedido(String nombre, long tiempoProceso) {
			this.nombre = nombre;
			this.tiempoProceso = tiempoProceso;
		}
		public String getNombre() {
			return nombre;
		}
		public long getTiempoProceso() {
			return tiempoProceso;
		}	
	}
	
	public AdministracionMcDonalds(){
		colaClientes=new Cola<String>();
		listaPedidos=new ListaDobleEncadenada <Pedido>();
	}
	
	public void agregarCliente(String nombre){
		colaClientes.encolar(nombre);
	}
	
	public String atenderCliente(Pedido pedido){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

		}
		listaPedidos.addLast(pedido);
		return colaClientes.desencolar();
	}
	
	public String entregarPedido(){
		Pedido p = listaPedidos.removeFirst();
		try {
			Thread.sleep(p.getTiempoProceso());
		} catch (InterruptedException e) {

		}
		return p.getNombre();
	}
	
	public int clientesEnFila(){
		return colaClientes.tamanio();
	}
	
	public int pedidosEnEspera(){
		return listaPedidos.size();
	}
	
	public Iterator<String> clientes(){
		return colaClientes.iterator();
	}
	
	public Iterator<Pedido> pedidos(){
		return listaPedidos.iterator ();
	}

}
