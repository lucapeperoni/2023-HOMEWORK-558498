package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.IOConsole;

public class ComandoGuarda {
	private IOConsole io;
	void guarda(Partita partita) {
		io.mostraMessaggio("Stanza corrente: "+partita.getStanzaCorrente().getNome());
		io.mostraMessaggio("Descrizione stanza: "+partita.getStanzaCorrente().getDescrizione());
		io.mostraMessaggio("Borsa attuale: "+partita.getGiocatore().getBorsa().toString());
		io.mostraMessaggio("CFU attuali: "+partita.getGiocatore().getCfu());
	}
}
