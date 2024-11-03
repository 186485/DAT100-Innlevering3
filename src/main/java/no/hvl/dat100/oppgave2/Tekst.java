package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	// objektvariabler
	private String tekst;
	public Tekst () {
		
	}
	//Henter fra forrige v/ å bruke super og legger til tekst
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst=tekst;
		
	}
	//Samme som over inkludert likes
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id,bruker, dato, likes);
		this.tekst=tekst;
	}
	//Set/get
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst=tekst;
	}
	//Skriver over toString ved å bruker Override
	@Override
	public String toString() {
		String toString=("TEKST"+"\n"+getId()+"\n"+getBruker()+"\n"+getDato()+"\n"+getLikes()+"\n"+tekst+"\n");
		return toString;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
