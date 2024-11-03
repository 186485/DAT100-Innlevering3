package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	//Lager private objektvariabler
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	
	public Innlegg() {
		
	}
	//henter variablene til innleggene 
	public Innlegg(int id, String bruker, String dato) {
		
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=0;
	}
	//henter variablene til innleggene ink likes
	public Innlegg(int id, String bruker, String dato, int likes) {
		
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;
		
	}
	//set/get metoder
	public String getBruker() {
		return bruker;
	}

	public void setBruker(String bruker) {
		this.bruker=bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
	this.dato=dato;
	}

	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public int getLikes() {
		return likes;
	}
	
	public void doLike () {
		likes+=1;
	}
	//Sjekker om innlegg/id er lik annet innlegg/id
	public boolean erLik(Innlegg innlegg) {
		
		id=getId();
		if(id==innlegg.getId()) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	//Lager utskrifts metode
	public String toString() {
		String toStreng=(getId()+"\n"+getBruker()+"\n"+getDato()+"\n"+getLikes()+"\n");
		return toStreng;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
