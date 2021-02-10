package neobavezniDomaciS15;

public class Igrac extends Osoba{
	private int brojIgraca;
	private String pozicijaIgraca;
	private boolean kapiten;
	
	public Igrac() {}

	public Igrac(String ime, String prezime, long jmbg, int godinaRodjenja, int brojIgraca, String pozicijaIgraca,
			boolean kapiten) {
		super(ime, prezime, jmbg, godinaRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicijaIgraca = pozicijaIgraca;
		this.kapiten = kapiten;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicijaIgraca() {
		return pozicijaIgraca;
	}

	public void setPozicijaIgraca(String pozicijaIgraca) {
		this.pozicijaIgraca = pozicijaIgraca;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void stampaj() {
		System.out.println("(" + getIme() +")" + ", (" + getPrezime() + "), (" + getGodinaRodjenja() + ") ");
		System.out.println("(" + brojIgraca + "), (" + pozicijaIgraca + "), (" + kapiten + ") ");
	}
	
}
