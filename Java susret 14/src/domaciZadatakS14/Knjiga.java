package domaciZadatakS14;

public class Knjiga {
	private String ISBN;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga(String iSBN, String naziv, int godinaIzdanja, Autor autor) {
		super();
		ISBN = iSBN;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}
	
	public void stampaj() {
		System.out.println("(" + ISBN + ")");
		System.out.println("(" + naziv + ")" + " - (" + godinaIzdanja + ")");
		System.out.print("autor: ");
		autor.stampaj();
		
	}
	
}
