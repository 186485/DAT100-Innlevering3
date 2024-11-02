package no.hvl.dat100.oppgave4;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.*;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		PrintWriter skriver = null;
		try {
			File fil = new File(mappe, filnavn);
			skriver = new PrintWriter(fil);
			
			Innlegg[] innleggTabell=samling.getSamling();
			
			for (int i=0; i<samling.getAntall();i++) {
				if(innleggTabell[i]!=null) {
					skriver.println(innleggTabell[i].toString());
				}
			}
			return true;
		}catch(IOException e) {
			e.printStackTrace();
			return false;
		}finally {
			if(skriver!=null) {
				skriver.close();
			}
		}
		
		
		
		
		
	

	}
}
