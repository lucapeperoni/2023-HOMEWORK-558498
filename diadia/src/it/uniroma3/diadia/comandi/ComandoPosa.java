package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoPosa implements Comando {
	private IOConsole io;
	String nomeAttrezzo;
	
	public ComandoPosa(String nomeAttrezzo){
		this.nomeAttrezzo = nomeAttrezzo;
		
	}
	
	@Override
	public void esegui(Partita partita) {
		Attrezzo a = partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
		if(a!=null) {
			partita.getStanzaCorrente().addAttrezzo(a);
			partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
			System.out.println("Oggetto posato!");
		}
		else {
			System.out.println("L' oggetto non puoi posarlo perche non lo hai nella borsa!");
		}
	}

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;
		
	}
}
