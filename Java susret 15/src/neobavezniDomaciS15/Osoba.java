package neobavezniDomaciS15;

public class Osoba {
	/*
	 * Kreirati klasu Osoba koja ima: ime i prezime jmbg godinu rodjenja default-ni
	 * konstuktor konstuktor sa parametrima gettere i settere metodu stampaj koja
	 * stampa u formatu: (ime i prezime), (jmbg), (godina rodjenja) Kreirati klasu
	 * Igrac koja nasledjuje klasu Osoba i koja ima: broj (broj koji igrac nosi)
	 * poziciju koju igra (odbrambeni, napadac, … ) kapiten (promenljiva koja kaze
	 * da li je igrac kapiten tima, i tipa je boolean) default-ni konstuktor
	 * konstuktor sa parametrima gettere i settere za broj, kapiten i poziciju
	 * metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve
	 * informacije o igracu Kreirati klasu Trener koja nasledjuje klasu Osoba i koja
	 * ima: godine iskustva tip trenera (kondicioni, za igru, pomocni, personalni)
	 * metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve
	 * informacije o treneru. U glavnom programu kreirati 2 igraca i 2 trenera, i
	 * istestirati metode.
	 */
	private String ime;
	private String prezime;
	private long jmbg;
	private int godinaRodjenja;
	
	public Osoba() {}
	
	public Osoba(String ime, String prezime, long jmbg, int godinaRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public long getJmbg() {
		return jmbg;
	}

	public void setJmbg(long jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}
	
	public void stampaj() {
		System.out.println("(" + ime +")" + ", (" + prezime + "), (" + godinaRodjenja + ") ");
	}
	
}
