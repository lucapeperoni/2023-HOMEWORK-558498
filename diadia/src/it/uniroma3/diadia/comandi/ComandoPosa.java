package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa {
	private void posa(String nomeAttrezzo) {
		Attrezzo a = this.partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
		if(a!=null) {
			this.partita.getStanzaCorrente().addAttrezzo(a);
			this.partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
			io.mostraMessaggio("Oggetto posato!");
		}
		else {
			io.mostraMessaggio("L' oggetto non puoi posarlo perche non lo hai nella borsa!");
		}
	}
}
