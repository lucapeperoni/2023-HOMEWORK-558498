package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.IOConsole;
public class ComandoNonValido implements Comando {
	private IOConsole io;

	@Override
	public void esegui(Partita partita) {
		System.out.println("Comando non valido!");
		
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}

}
