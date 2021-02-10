package domaciZadatakAutomobilS11;

public class AutomobilMain {

	public static void main(String[] args) {
		Automobil auto1 = new Automobil("BMW", 58947653);
		auto1.prikaziPodatkeAutomobila();
		auto1.setVlasnik("Cristiano Ronaldo");
		auto1.prikaziPodatkeAutomobila();
		System.out.println();
		Automobil auto2 = new Automobil("Toyota", 25478312, "David Becham");
		auto2.prikaziPodatkeAutomobila();
		auto2.setVlasnik("Gary Neville");
		auto2.prikaziPodatkeAutomobila();
		System.out.println();
		System.out.println("Trenutni vlasnik automobila sa VIN brojem " + auto1.getSerijskiBroj() 
		+ " je " + auto1.getVlasnik() + ".");
		System.out.println();
		System.out.println("Trenutni vlasnik automobila sa VIN brojem " + auto2.getSerijskiBroj() 
		+ " je " + auto2.getVlasnik() + ".");
		System.out.println();
		System.out.println("Marke unetih automobila su " + auto1.getMarka() + " i " + auto2.getMarka() + ".");

	}

}
