package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoPrendi implements Comando {
	private IOConsole io;
	private String nomeAttrezzo;
	
	public ComandoPrendi(String nomeAttrezzo) {
		this.nomeAttrezzo = nomeAttrezzo;
	}

	@Override
	public void esegui(Partita partita) {
		Attrezzo a = partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo);
		if(a != null) {
			partita.getGiocatore().getBorsa().addAttrezzo(a);
			partita.getStanzaCorrente().removeAttrezzo(a);
			System.out.println("Oggetto preso!");
		}
		else {
			System.out.println("L'oggetto selezionato non si trova in questa stanza!");
		}
	}

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;
	}
}
