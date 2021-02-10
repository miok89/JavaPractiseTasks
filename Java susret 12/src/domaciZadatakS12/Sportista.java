package domaciZadatakS12;

/*1.Sportista poseduje ime, prezime i godinu rodjenja. 
 * Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu 
 * da se promene. Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja*/

public class Sportista {
	private String ime;
	private String prezime;
	private int godinaRodjena;

	public Sportista(String ime, String prezime, int godinaRodjena) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjena = godinaRodjena;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodinaRodjena() {
		return godinaRodjena;
	}

	public void ispisi() {
		System.out.println(ime.toUpperCase() + "_" + prezime.toUpperCase() + ": "
				+ godinaRodjena);
	}
}
