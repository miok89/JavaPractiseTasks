package DomaciZadatakS3;

public class Zadatak3 {

	public static void main(String[] args) {
/*3.Napisati program koji ce prebrojati koliko je 
  brojeva od 9 do 250 (ukljucujuci i njih) 
  deljivih brojem 3.*/
		int j = 0;
	for (int i = 9; i <= 250; i++) {
		if (i%3 == 0) {
			j ++;
		}
	}
	System.out.println("Ukupan broj brojeva deljivih sa 3 je: " + j);
	System.out.println("Kraj programa!");
	}
}
