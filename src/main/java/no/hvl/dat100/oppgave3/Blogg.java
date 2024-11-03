package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;

public class Blogg {
	//Variabler
	private Innlegg[] innleggstabell;
	private int nesteledig;
	//Lager bloggtabell med plass til 20 innlegg
	public Blogg() {
		innleggstabell = new Innlegg[20];
		nesteledig = 0;
	}
	//Lager bloggtabell med plass til antall som er definert i lengde
	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}
	//Set/Get
	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {

		return innleggstabell;

	}
	//Diverse metoder for søke i tabellen/endre tabellen
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
		Innlegg[] gammelTabell = innleggstabell;//lager en midlertidig tabell som er lik den gamle

		innleggstabell = new Innlegg[gammelTabell.length * 2];//Lager en innleggstabell som er samme størrelse*2(40)
		for (int i = 0; i < gammelTabell.length; i++) {
			innleggstabell[i] = gammelTabell[i];//Setter den gamle tabellen lik de første 20 plassene i den nye
		}

	}

	public boolean leggTilUtvid(Innlegg innlegg) {
		//Utvider tabellen om det ikke er plass til å legge til et nytt innlegg, dobbler lengden
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
	            innleggstabell[posisjon] = null;//Setter den utvalgte posisjonen(Poisjonen til innlegget vi ønsker å fjerne)lik null
	            innleggstabell[posisjon]=innleggstabell[nesteledig-1];//Så settes siste innlegg i tabellen inn der det ble slettet
	            innleggstabell[nesteledig-1]=null;//Setter plassen til det gamle innlegget som ble flyttet lik null
	            nesteledig-=1;
	            return true;//Om det ble utført true 
	        } 
	    } 
	    return false;//om innlegget ikke finnes false
	}
	

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}