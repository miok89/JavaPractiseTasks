package domaciZadatakS12;

public class Main {

	public static void main(String[] args) {
		
		Klub klub1 = new Klub("Tottenham Hotspur FC", "London", 1882, 10);
		Sportista fudbaler1 = new Sportista("Harry", "Kane", 1993);
		Sportista fudbaler2 = new Sportista("Sergio", "Aguero", 1989);
		Sportista fudbaler3 = new Sportista("Stefan", "Savic", 1987);
		Sportista fudbaler4 = new Sportista("Aleksandar", "Mitrovic", 1993);
		
		klub1.dodajSportistu(fudbaler1);
		klub1.dodajSportistu(fudbaler2);
		klub1.dodajSportistu(fudbaler3);
		klub1.dodajSportistu(fudbaler4);
		
		klub1.ispisi();
		klub1.ukloniSportistu(fudbaler1);
		klub1.ispisi();
		klub1.ukloniSportistu(fudbaler4);
		klub1.ispisi();
	}
}
