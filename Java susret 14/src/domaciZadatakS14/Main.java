package domaciZadatakS14;

public class Main {

	public static void main(String[] args) {
		Autor autor1 = new Autor("Jo", "Nesbo");
		Autor autor2 = new Autor("Erich", "Maria Remarque");
		Autor autor3 = new Autor("Mario", "Puzo");
		Knjiga knjiga1 = new Knjiga("123-456-789-45-365", "The Thirst", 2017, autor1);
		Knjiga knjiga2 = new Knjiga("653-456-259-45-365", "All Quiet on the Western front", 1929, autor2);
		Knjiga knjiga3 = new Knjiga("582-456-789-45-784", "The Godfather", 1969, autor1);
		
		System.out.println("Autori: ");
		autor1.stampaj();
		System.out.println("\n");
		autor2.stampaj();
		System.out.println("\n");
		autor3.stampaj();
		System.out.println("\n");
		System.out.println("Knjige: ");
		knjiga1.stampaj();
		System.out.println("\n");
		knjiga2.stampaj();
		System.out.println("\n");
		knjiga3.stampaj();
	}

}
