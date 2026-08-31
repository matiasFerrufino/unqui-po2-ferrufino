package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;


public class Counter {
	
	private List<Integer> counter = new ArrayList<>();
	
	public Counter (List<Integer> listaDeNumeros) {
		this.agregarNumeros(listaDeNumeros);
	}
	
	private void agregarNumeros (List<Integer> listaDeNumeros) {
		this.counter.addAll(listaDeNumeros);
	}
	
/*Ejercicio 1*/	
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
	
/*Ejercicio 2*/
	
	public int desarmador() {
		this.validarLista(counter);  /*Valido por si es lista vacia*/
		int maximoHastaAhora = counter.get(0); /*Inicializo el maximo de la lista que seria el primer elemento por default*/
		for (int e = 1 ; e < counter.size(); e ++) {
			int numeroActual = counter.get(e);
			maximoHastaAhora = this.elMayorEntre_Y_(numeroActual,maximoHastaAhora);
		}
		return maximoHastaAhora;
	}
	
	private void validarLista(List<Integer> unaLista) {
		if (unaLista.isEmpty()) {
			throw new IllegalArgumentException("La lista esta vacia, no se puede comparar");
		}
	}
	
	private int elMayorEntre_Y_(int primerNumero, int segundoNumero) {
		int numeroUno = this.cantDigitosPares(primerNumero);
		int numeroDos = this.cantDigitosPares(segundoNumero);
		if (numeroUno > numeroDos) {
			return primerNumero;
		}
		else {
			return segundoNumero;
		}
	}
	
	private int cantDigitosPares(int unNumero) {
		int digito = unNumero % 10;   /*Aca separo el digito*/
		int numeroRestante = unNumero / 10; /*Aca me quedo con la parte entera del numero*/
		int cantDigitos = 0; /*Me quedo con la cantidad de digitos hasta ahora*/
		
		/*Bucle de conteo de digitos pares*/
		while (numeroRestante != 0) {
			cantDigitos += this.unoSiEsParCeroSino(digito);
			digito = numeroRestante % 10;
			numeroRestante = numeroRestante /10;
		}
		cantDigitos += this.unoSiEsParCeroSino(digito);
		return cantDigitos;
	}
	
	private int unoSiEsParCeroSino (int unNumero) {
		boolean esPar = unNumero % 2 == 0;
		if (esPar) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	/*Ejercicio 3*/
	
	public int multiploDe_YDe_(int x, int y) {
		this.validarMultiplo(x, y);
		int numeroRestante = 1000;
		while (numeroRestante != 0 && !this.seEncontroElNumero(numeroRestante,x,y)) {
			numeroRestante -= 1;
		}
		return this.comprobarNum(numeroRestante);
		
	}
	
	private int comprobarNum(int unNumero) {
		if (unNumero != 0) {
			return unNumero;
		}
		else {
			return -1;
		}
	}
	
	public void validarMultiplo(int x, int y) {
		if (x == 0 || y== 0 ) {
			throw new IllegalArgumentException("No se puede dividir por cero");
		}
	}
	
	private boolean seEncontroElNumero(int numeroBuscado, int numUno, int numDos) {
		return numeroBuscado % numUno == 0 && numeroBuscado % numDos == 0;
	}
	
	/*Ejercicio 4*/
	/*  
	 * 1- devuelve 3
	 * 2- salta error porque no se le asigno nada a t 
	 * 3- concatena el 1 con el string a y quedaria "1abc"
	 * 4- devuelve ABC
	 * 5- devuelve 4, el indice de la letra dada, buscando de izquierda a derecha
	 * 6- devuelve 3, el indice de la letra dada, buscando de derecha a izquierda
	 * 7- devuelve "il" agarra el medio entre los indices dados, el indice del fin no esta incluido.
	 * 8- devuelve false, la funcion evalua si el texto comienza con lo que se le pasa por parametro.
	 * 9- devuelve true 
	 * 10- devuelve false   */
	
	/*Ejercicio 5
	  1- No son objetos creados a partir de una clase, ya vienen predefinidos en el lenguaje,
	  en este sentido, no se pueden utilizar metodos sobre ellos como .lenght, guardan valor directamente
	  en la memoria en vez de guardar una referencia hacia un objeto.
	  
	  2- int es un tipo de dato primitivo, mientras que Integer no, ya que este ultimo
	  cuenta con la utilizacion de metodos para diferentes funcionalidades.
	  
	  3- en las variables de instancias, java asigna valores pretederminados, para int = 0 y para Integer = null
	  
	  4- en las variables de metodos, java no asigna nada y el compilador no deja compilar */
	
	/*Ejercicio 7
	  
	  1- Están organizados en una estructura de carpetas anidadas dentro del directorio fuente (src), 
	  donde cada punto en el nombre del paquete representa un nivel de subcarpeta (por ejemplo, 
	  la carpeta model contiene adentro a la carpeta gui).
	  
	  2- Sí, los nombres de los paquetes coinciden exactamente con la estructura de directorios en 
		 el sistema de archivos tanto para los archivos fuente (.java) como 
		 para los compilados (.class), guardando ambos en rutas paralelas según su paquete.
	  
	    */
	
	
	
	
	
	
	
	
	
}
