package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
public class ComandoAiuto implements Comando {
	static final private String[] elencoComandi = {"vai", "aiuto", "fine"};
	static final private String[] elencoDirezioni = {"nord", "sud", "ovest", "est"};
	static final private String[] prendiAttrezzo = {"prendi <nomeAttrezzo>"};
	static final private String[] posaAttrezzo = {"posa <nomeAttrezzo>"};
	private IOConsole io; 
	
	/**
	 * Stampa informazioni di aiuto.
	 */
	
	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< elencoComandi.length; i++) 
			System.out.println(elencoComandi[i]+" ");
		System.out.println("");
		for(int i=0; i< elencoDirezioni.length; i++) 
			System.out.println(elencoDirezioni[i]+" ");
		System.out.println("");		
		for(int i=0; i< prendiAttrezzo.length; i++) 
			System.out.println(prendiAttrezzo[i]+" ");
		System.out.println("");
		for(int i=0; i< posaAttrezzo.length; i++) 
			System.out.println(posaAttrezzo[i]+" ");
		System.out.println("");
	}

	@Override
	public void setParametro(String parametro) {
		
	}
}
