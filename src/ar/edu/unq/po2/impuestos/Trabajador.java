package ar.edu.unq.po2.impuestos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<>();
	
	Trabajador () {
		
	}
	
	public double getTotalPercibido () {
		Stream<Ingreso> ingresosACalcular = ingresos.stream();
		double percepcionTotal = ingresosACalcular.
							     mapToDouble(i -> i.getMontoPercibido()).
							     sum();
		
		return percepcionTotal;
		
	}
	
	public double getMontoImponible() {
		Stream<Ingreso> ingresosACalcular = ingresos.stream();
		double montoImponibleTotal = ingresosACalcular.
							     mapToDouble(i -> i.montoImponible()).
							     sum();
		
		return montoImponibleTotal;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
	public void addIngreso (Ingreso unIngreso) {
		ingresos.add(unIngreso);
	}
	
	
}

