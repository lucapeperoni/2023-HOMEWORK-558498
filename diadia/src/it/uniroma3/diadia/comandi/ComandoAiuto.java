package it.uniroma3.diadia.comandi;

public class ComandoAiuto {
	static final private String[] elencoComandi = {"vai", "aiuto", "fine"};
	static final private String[] elencoDirezioni = {"nord", "sud", "ovest", "est"};
	static final private String[] prendiAttrezzo = {"prendi <nomeAttrezzo>"};
	static final private String[] posaAttrezzo = {"posa <nomeAttrezzo>"};

	/**
	 * Stampa informazioni di aiuto.
	 */
	private void aiuto() {
		for(int i=0; i< elencoComandi.length; i++) 
			io.mostraMessaggio(elencoComandi[i]+" ");
		io.mostraMessaggio("");
		for(int i=0; i< elencoDirezioni.length; i++) 
			io.mostraMessaggio(elencoDirezioni[i]+" ");
		io.mostraMessaggio("");		
		for(int i=0; i< prendiAttrezzo.length; i++) 
			io.mostraMessaggio(prendiAttrezzo[i]+" ");
		io.mostraMessaggio("");
		for(int i=0; i< posaAttrezzo.length; i++) 
			io.mostraMessaggio(posaAttrezzo[i]+" ");
		io.mostraMessaggio("");
	}


}
