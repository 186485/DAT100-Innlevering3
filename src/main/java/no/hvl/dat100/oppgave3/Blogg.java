package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	
	private Innlegg[] innleggstabell;
	private int nesteledig;
	
	public Blogg() {
	innleggstabell= new Innlegg[20];
	nesteledig=0;
	}

	public Blogg(int lengde) {
	innleggstabell= new Innlegg[lengde];
	nesteledig=0;
	}

	public int getAntall() {
		return innleggstabell.length;
	}
	
	public Innlegg[] getSamling() {
		
		throw new UnsupportedOperationException(TODO.method());	
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}