package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.*;

public class Bilde extends Tekst {
	//Lager en privat variabel fofr url
	private String url;
	//Henter variablene fra innlegg
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url=url;
	}
	//Samme som over inkludert likes
	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url=url;
	}
	//Set/get
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url=url;
	}

	@Override //Bruker override for å skrive over gammel metode
	public String toString() {
		String toString=("BILDE"+"\n"+getId()+"\n"+getBruker()+"\n"+getDato()+"\n0\net bilde\n"+getUrl()+"\n");
		return toString;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
