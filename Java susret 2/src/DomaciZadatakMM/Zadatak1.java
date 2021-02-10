package DomaciZadatakMM;

import java.util.Scanner;

public class Zadatak1 {
	
	public static String ZaokruziNa2Dec(double vrednost)
	{
	    return String.format("%.2f", vrednost);
	}

	public static void main(String[] args) {
		/*1.Napisati program koji ce traziti unos 3 broja sa tastature koji ce 
		 predstavljati duzinu 3 stranice nekog trougla. U zavisnosti od duzine stranice, 
		 ispisati da li je trougao jednakostranicni, jednakokraki ili raznostranican trougao.*/
		
		double broj1;
		double broj2;
		double broj3;
		
		Scanner citac = new Scanner(System.in);
		System.out.println("Ukucajte vrednsti brojeva za sve 3 stranice trugla: ");
		broj1 = citac.nextDouble();
		broj2 = citac.nextDouble();
		broj3 = citac.nextDouble();
		
		if (broj1 == broj2 && broj2 == broj3) {
			System.out.println("Jednakostranican trougao.");
		}else if (broj1 == broj2 && broj2 != broj3) {
			System.out.println("Jednakokraki trougao.");
		}else if (broj1 == broj3 && broj1 != broj2) {
			System.out.println("Jednakokraki trougao.");
		}else if (broj2 == broj3 && broj3 != broj1) {
			System.out.println("Jenakokraki trougao.");
		}else {
			System.out.println("Raznostranican trougao.");
		}
		System.out.println("Kraj programa!");
	}
}

