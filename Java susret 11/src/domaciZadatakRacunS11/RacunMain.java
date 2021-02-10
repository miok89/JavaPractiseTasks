package domaciZadatakRacunS11;

public class RacunMain {

	public static void main(String[] args) {

		Racun racun1 = new Racun("10023", 2000);
		System.out.println("Stanje na racunu: " + racun1.getBrRacuna() + " je " + racun1.getStanje() + "rsd.");
		System.out.println("");
		
		racun1.uzimanjeNovca(racun1.getBrRacuna(), -350);
		System.out.println("Stanje na racunu: " + racun1.getBrRacuna() + " je " + racun1.getStanje() + "rsd.");
		System.out.println("");
		
		Racun racun2 = new Racun("10001", 3000);
		System.out.println("Stanje na racunu: " + racun2.getBrRacuna() + " je " + racun2.getStanje() + "rsd.");
		System.out.println("");
		
		racun2.dodavanjeNovca(racun2.getBrRacuna(), 2500);
		System.out.println("Stanje na racunu: " + racun2.getBrRacuna() + " je " + racun2.getStanje() + "rsd.");
		System.out.println();
		
		racun2.uzimanjeNovca(racun2.getBrRacuna(), 1200);
		System.out.println("Stanje na racunu: " + racun2.getBrRacuna() + " je " + racun2.getStanje() + "rsd.");
	}

}
