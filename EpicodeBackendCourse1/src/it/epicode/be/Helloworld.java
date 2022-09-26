package it.epicode.be;

import java.util.Iterator;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
	
		String[] a = {"1","2","3","4","5"};
		
		System.out.println("This is my first Epicode Java Project!");
		
		System.out.println(Moltiplica(2, 4));
		
		System.out.println(Concatena("popi", 2));
		
		String[] d = InsertIn3rdPos(a, "22");
		
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		Arrayyyyy();
		
		System.out.println(Triangolo(12,2,3));
		
		System.out.println(Rettangolo(12,2));
		
		System.out.println(PoD());

		}


public static int Moltiplica(int a, int b) {
	return a*b;
}

public static String Concatena(String a, int b) {
	return a + b;
}

public static String[] InsertIn3rdPos(String[] a, String b) {
	String[] c = new String[6];
	int j = 0;
	
	for(int i = 0; i < c.length; i++) {
		if(i==2) {
			c[i] = b;
		}else {
			c[i] = a[j];
			j++;
		}
	}
	return c;
}

public static void Arrayyyyy() {
	
	Scanner[] a = new Scanner[3];
	
	for (int i = 0; i < a.length; i++) {
		a[i] =  new Scanner(System.in);
	}
	for (int i = 3; i < a.length; i--) {
		System.out.println(a[i]);
	}
	
}

public static double Triangolo(double a, double b, double c) {
	double p = (a+b+c)/2;
	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}

public static int Rettangolo(int a, int b) {
	return a*b;
}

public static int PoD() {
	
	String numero = new Scanner(System.in).next();
	int my_number = Integer.parseInt(numero);
	if(my_number % 2 == 0) {
		return 0;
	}else {
		return 1;
	}
	
}

} 



 