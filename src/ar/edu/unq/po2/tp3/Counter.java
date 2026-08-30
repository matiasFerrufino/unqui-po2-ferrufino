package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Counter {
	
	private List<Integer> counter = new ArrayList<>();
	
	public Counter (List<Integer> listaDeNumeros) {
		this.agregarNumeros(listaDeNumeros);
	}
	
	private void agregarNumeros (List<Integer> listaDeNumeros) {
		this.counter.addAll(listaDeNumeros);
	}
	
	
	public int countNumPar() {
		int conteoDePares = 0;
		
		for (int numeroActual : counter) {
			
			if (numeroActual %2 == 0) {
				conteoDePares += 1;
			}
		}
		return conteoDePares;
	}
	
	public int countNumImpar() {
		int conteoDeImpares = 0;
		
		for (int numeroActual : counter) {
			
			if (numeroActual %2 !=  0) {
				conteoDeImpares += 1;
			}
		}
		return conteoDeImpares;
	}
	
	public int countNumMultiploDe_(int unNumero) {
		int conteoDeMultiplo = 0;
		
		for (int numeroActual : counter) {
			
			if (numeroActual %unNumero == 0) {
				conteoDeMultiplo += 1;
			}
		}
		return conteoDeMultiplo;
	}
	
	
	
	
	
	
	
}
