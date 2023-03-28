package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class StanzaTest {
	private Stanza stanzaTest;
	private Attrezzo clava;
	private Attrezzo lanterna;
	
	@BeforeEach
	public void setUp() {
		this.stanzaTest = new Stanza("stanzaTest");
		this.clava = new Attrezzo("clava", 1);
		this.lanterna = new Attrezzo("lanterna", 3);
	}
	@Test
	void testAddAttrezzo() {
		assertEquals(true, stanzaTest.addAttrezzo(clava));
	}
	@Test 
	void testRemoveAttrezzo(){
		assertEquals(true, stanzaTest.removeAttrezzo(clava));
	}
	@Test 
	void testHasAttrezzo(){
		assertEquals (false, stanzaTest.hasAttrezzo("clava"));
	}
	

}
