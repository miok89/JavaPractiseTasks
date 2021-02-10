package neobavezniDomaciS15;

public class Trener extends Osoba{
	private int godineIskustva;
	private String tipTrenera;
	
	public Trener(String ime, String prezime, long jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(ime, prezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}
	
	public void stampaj() {
		System.out.println("(" + getIme() +")" + ", (" + getPrezime() + "), (" + getGodinaRodjenja() + ") ");
		System.out.println("(" + godineIskustva + "), (" + tipTrenera + ")");
	}
	
}
