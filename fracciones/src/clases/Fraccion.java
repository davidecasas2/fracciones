package clases;

import java.util.Objects;

public class Fraccion {

	private int numerador;
	private int denominador;
	
	public Fraccion() {
		this.denominador=1;
	}
	
	public Fraccion(Fraccion f) {
		this.numerador=f.numerador;
		this.denominador=f.denominador;
	}
	
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	
	public Fraccion(int numerador) {
		this.numerador = numerador;
		this.denominador=1;
	}



	public double valorDecimal() {
		return (double) numerador/denominador;
	}
	
	public Fraccion multiplicar(Fraccion f2) {
		Fraccion res = new Fraccion();
		res.numerador=this.numerador*f2.numerador;
		res.denominador=this.denominador*f2.denominador;
		
		return res;
	}

	public Fraccion sumar(Fraccion f2) {
		Fraccion res = new Fraccion();
		int m = mcm(this.denominador,f2.denominador);
		res.denominador=m;
		res.numerador= m/this.denominador *this.numerador +
				m/f2.denominador *f2.numerador;
		res.simplificar();
		return res;
	}
	
	public Fraccion restar(Fraccion f2) {
		Fraccion aux= new Fraccion(f2);
		aux.numerador=-aux.numerador;
		return this.sumar(aux);
	}

	public Fraccion multiplicar(int num) {
		Fraccion res = new Fraccion();
		res.numerador=this.numerador*num;
		res.denominador=this.denominador*1;
		
		return res;
	}
	
	public Fraccion dividir(Fraccion f2) {
		Fraccion res = new Fraccion();
		res.numerador=this.numerador*f2.denominador;
		res.denominador=this.denominador*f2.numerador;
		res.simplificar();
		return res;
	}
	

	@Override
	public String toString() {
		return numerador +"/"+denominador;
	}



	@Override
	public int hashCode() {
		return Objects.hash(denominador, numerador);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion other = (Fraccion) obj;
		return this.valorDecimal()==other.valorDecimal();
	}

	public static int mcd(int a, int b) {
		int dividendo = Math.abs(Math.max(a, b));
		int divisor = Math.abs(Math.min(a, b));
		
		int aux= divisor;
		while (divisor!=0) {
			aux=divisor;
			divisor=dividendo%divisor;
			dividendo=aux;
		}
		return dividendo;
	}
	
	public static int mcm(int a, int b) {
		return (a*b)/mcd(a,b);
	}
	
	public void simplificar() {
		int m = Fraccion.mcd(numerador, denominador);
		
		this.numerador= this.numerador/m;
		this.denominador=this.denominador/m;
	}



	public int getNumerador() {
		return numerador;
	}



	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}



	public int getDenominador() {
		return denominador;
	}



	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	

	
	
	
}
