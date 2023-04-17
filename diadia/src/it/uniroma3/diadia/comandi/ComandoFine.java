package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoFine implements Comando {
	private IOConsole io;
	/**
	 * Comando "Fine".
	 */
	private void fine() {
		System.out.println("Grazie di aver giocato!");  // si desidera smettere
	}
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}

}
