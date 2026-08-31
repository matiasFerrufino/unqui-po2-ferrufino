package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class MultiOperador {
	
	private List<Integer> listaNumeros = new ArrayList<>();
	
	public MultiOperador(List<Integer> unaLista) {
		this.listaNumeros.addAll(unaLista);
	}
	
	private void validarCuenta() {
	    if (listaNumeros.isEmpty()) {
	        throw new IllegalArgumentException("¡La lista no puede estar vacía!");
	    }
	}
	
	public int sumarTodo () {
		this.validarCuenta();
		int cantCuenta = 0;
		for (int numeroActual : listaNumeros) {
			cantCuenta += numeroActual;
		}
		return cantCuenta;
	}
	
	public int restarTodo () {
		this.validarCuenta();
		int cantCuenta = listaNumeros.get(0);
		for (int n = 1; n < listaNumeros.size(); n++) {
			cantCuenta -= listaNumeros.get(n);
		}
		return cantCuenta;
	}
	
	public int multiplicarTodo() {
		this.validarCuenta();
		int cantCuenta = listaNumeros.get(0);
		for (int n = 1; n < listaNumeros.size(); n++) {
			cantCuenta *= listaNumeros.get(n);
		}
		return cantCuenta;
	}
	
	
	
	
	

}
