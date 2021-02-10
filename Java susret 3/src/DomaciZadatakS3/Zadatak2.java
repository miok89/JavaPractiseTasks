package DomaciZadatakS3;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
/*2.Napisati program koji unosi i sabira brojeve dokle god nije 
unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11*/
		int broj = 0;
		int suma = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Unesite broj: ");
			suma = suma + broj;
			broj = sc.nextInt();
			i++;	
		}while (broj >= 0);	
		System.out.println("Suma je: " + suma + " od unesenih " + i + " brojeva.");
		System.out.println("Kraj programa!");
	}

}
