package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;

public class Blogg {

	private Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {

		return innleggstabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggstabell[i].equals(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggstabell.length) {
			return true;
		}
		return false;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
		}
		if (!ledigPlass()) {
			return false;
		}
		innleggstabell[nesteledig] = innlegg;
		nesteledig++;
		return true;
	}

	@Override
	public String toString() {
		String utskrift = nesteledig + "\n";

		for (int i = 0; i < nesteledig; i++) {
			if (innleggstabell[i] != null) {
				utskrift += innleggstabell[i].toString();
			}
		}

		return utskrift;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		Innlegg[] gammelTabell = innleggstabell;

		innleggstabell = new Innlegg[gammelTabell.length * 2];
		for (int i = 0; i < gammelTabell.length; i++) {
			innleggstabell[i] = gammelTabell[i];
		}

	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		if (!finnes(innlegg)) {
			if (nesteledig >= innleggstabell.length) {
				utvid();
			}
			leggTil(innlegg);
			return true;
		}
		return false;
	}

	public boolean slett(Innlegg innlegg) {
	    int posisjon = finnInnlegg(innlegg);
	    if (posisjon != -1) {
	        if (finnes(innlegg)) {
	            innleggstabell[posisjon] = null;
	            innleggstabell[posisjon]=innleggstabell[nesteledig-1];
	            innleggstabell[nesteledig-1]=null;
	            nesteledig-=1;
	            return true;
	        } 
	    } 
	    return false;
	}
	

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}