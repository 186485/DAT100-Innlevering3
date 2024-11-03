package no.hvl.dat100.oppgave4;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.*;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		//checklist
		//Åpne fil 
		//Skrive til fil
		//Lukke fil etter skrving
		//Huske unntak
		
		PrintWriter skriver = null;// setter til null for å unngå problemer
		try {
			// Oppretter fil i mappen vi har definert på forhånd 
			File fil = new File(mappe, filnavn);
			skriver = new PrintWriter(fil);
			
			// Henter blogg innleggene slik at vi kan bruke den i denne metoden
			Innlegg[] innleggTabell = samling.getSamling();
			
			// Skriver til fil
			for (int i = 0; i < samling.getAntall(); i++) {
				if (innleggTabell[i] != null) {
					skriver.println(innleggTabell[i].toString());
				}
			}
			return true;// Skriver true tilbake om vi utfører skriving
		} catch (IOException e) {// unntak
			e.printStackTrace();
			return false;// Skriver false tilbake om vi ikke skriver
		} finally {
			if (skriver != null) {
				skriver.close();// lukker skriveren
			}
		}

	}
}
