package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.Partita;

public class ComandoPrendi {
	private void prendi(String nomeAttrezzo) {
		Attrezzo a = this.partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo);
		if(a != null) {
			this.partita.getGiocatore().getBorsa().addAttrezzo(a);
			this.partita.getStanzaCorrente().removeAttrezzo(a);
			io.mostraMessaggio("Oggetto preso!");
		}
		else {
			System.out.println("L'oggetto selezionato non si trova in questa stanza!");
		}
	}

}
