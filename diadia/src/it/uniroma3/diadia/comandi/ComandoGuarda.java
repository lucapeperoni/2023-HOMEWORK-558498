package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.IOConsole;


public class ComandoGuarda implements Comando {
	private IOConsole io;
	public void esegui(Partita partita) {
		System.out.println("Stanza corrente: "+partita.getStanzaCorrente().getNome());
		System.out.println("Descrizione stanza: "+partita.getStanzaCorrente().getDescrizione().toString());
		System.out.println("Borsa attuale: "+partita.getGiocatore().getBorsa().toString());
		System.out.println("CFU attuali: "+partita.getGiocatore().getCfu());
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}
}
