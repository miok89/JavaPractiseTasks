package domaciZadatakS12;

/*Klub poseduje naziv, sediste (grad), godinu osnivanja i sportistu. 
 * Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.*/

/*Dodatak zadatku: U Klubu napraviti niz sportista tipa Sportista umesto 
 * jednog sportiste. Samim tim postojace metode koje ce dodavati 
 * i uklanjati sportistu.
*/

public class Klub {
	private String naziv;
	private String grad;
	private int godinaOsnivanja;
	private Sportista[] nizSportista;

	public Klub(String naziv, String grad, int godinaOsnivanja, int brojSportistaUnizu) {
		super();
		this.naziv = naziv;
		this.grad = grad;
		this.godinaOsnivanja = godinaOsnivanja;
		this.nizSportista = new Sportista[brojSportistaUnizu];
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getGrad() {
		return grad;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public Sportista[] getNizSportista() {
		return nizSportista;
	}

	public void setNizSportista(Sportista[] nizSportista) {
		this.nizSportista = nizSportista;
	}

	public void dodajSportistu(Sportista sportista) {
		for (int i = 0; i < nizSportista.length; i++) {
			if (nizSportista[i] == null) {
				nizSportista[i] = sportista;
				break;
			}
		}
	}

	public void ukloniSportistu(Sportista sportista) {
		for (int i = 0; i < nizSportista.length; i++) {
			if (nizSportista[i] != null) {
				nizSportista[i] = null;
				break;
			}
		}
	}

	public void ispisi() {
		System.out.println("****Klub****");
		System.out.println(naziv + "; " + grad + "; " + godinaOsnivanja + "; ");
		System.out.println("****Sportisti u klubu****");
		for (int i = 0; i < nizSportista.length; i++) {
			if (nizSportista[i] != null) {
				nizSportista[i].ispisi();
			}
		}
		System.out.println("--------------------------------------------");
	}
}
