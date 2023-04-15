package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComandoVaiTest {
	
	private Partita partita;
	
	@BeforeEach
	public void setUp() {
		this.partita=new Partita();
	}
	
	@Test
	void vaiNord() {
		String stanzaAttesa=this.partita.getStanzaCorrente().getStanzaAdiacente("nord").getNome();
		ComandoVai cmd = new ComandoVai("nord");
		cmd.esegui(this.partita);
		assertTrue(this.partita.getStanzaCorrente().getNome().equals(stanzaAttesa), "mi aspettavo di stare in "+stanzaAttesa+" ma mi trovo in "+this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	void vaiEst() {
		String stanzaAttesa = this.partita.getStanzaCorrente().getStanzaAdiacente("est").getNome();
		ComandoVai cmd = new ComandoVai("est");
		cmd.esegui(this.partita);
		assertTrue(this.partita.getStanzaCorrente().getNome().equals(stanzaAttesa), "mi aspettavo di stare in "+stanzaAttesa+" ma mi trovo in "+this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	void vaiOvest() {
		String stanzaAttesa=this.partita.getStanzaCorrente().getStanzaAdiacente("ovest").getNome();
		ComandoVai cmd = new ComandoVai("ovest");
		cmd.esegui(this.partita);
		assertTrue(this.partita.getStanzaCorrente().getNome().equals(stanzaAttesa), "mi aspettavo di stare in "+stanzaAttesa+" ma mi trovo in "+this.partita.getStanzaCorrente().getNome());
	}
	
	@Test
	void vaiSud() {
		String stanzaAttesa=this.partita.getStanzaCorrente().getNome();
		ComandoVai cmd = new ComandoVai("sud");
		cmd.esegui(this.partita);
		assertFalse(this.partita.getStanzaCorrente().getNome().equals(stanzaAttesa), "mi aspettavo di stare in "+stanzaAttesa+" ma mi trovo in "+this.partita.getStanzaCorrente().getNome());
	}
}