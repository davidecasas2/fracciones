package clases;

import java.util.Scanner;

public class ppal {

	public static void main(String[] args) {
		Fraccion f = new Fraccion();
		
		System.out.println("El valor decimal de l fracccion es "+ f.valorDecimal());

		Fraccion f2 = new Fraccion(2,3);
		Fraccion f3 = new Fraccion(4,5);
		
		Fraccion mult = f2.multiplicar(f3);
		System.out.println("La multiplicacion es "+ mult);
		
		System.out.println(f2 + " multiplicado por 4 es "+f2.multiplicar(4));
		
		int num2=4;
		
		mult= f2.multiplicar(num2);
		
		Fraccion f4 = new Fraccion(4,6);
		
		if (f2.equals(f4)) {
			System.out.println(f2 +" y "+ f4 + " son iguales");
		} else {
			System.out.println(f2 +" y "+ f4 + " NO son iguales");
		}
		
		System.out.println("EL mcd de 18 y 24 es "+ Fraccion.mcd(18, 24));
		
		
		Fraccion comp = new Fraccion(48,36);
		System.out.println("La fraccion antes de simplicficar es "+comp);
		comp.simplificar();
		System.out.println("La fraccion simplificada es "+comp);
		
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("fraccion 1");
		System.out.println("Numerador: ");
		f.setNumerador(entrada.nextInt());
		System.out.println("denominador");
		f.setDenominador(entrada.nextInt());
		
		System.out.println("fraccion 2");
		System.out.println("Numerador: ");
		f2.setNumerador(entrada.nextInt());
		System.out.println("denominador");
		f2.setDenominador(entrada.nextInt());
		
		Fraccion res = f.sumar(f2);
		System.out.println("La suma de "+f+ " y "+f2+ " es "+res);
		res = f.restar(f2);
		System.out.println("La resta de "+f+ " y "+f2+ " es "+res);

		System.out.println("La division de "+f+ " y "+f2+ " es "+f.dividir(f2));
	}

}
