package it.uniroma3.diadia.giocatore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import it.uniroma3.diadia.attrezzi.Attrezzo;


public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private List<Attrezzo> attrezzi;
	private SortedSet<Attrezzo> ss;
	private int pesoMax;

	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}
	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax; // speriamo bastino...
		this.attrezzi = new ArrayList<Attrezzo>();
	}
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (attrezzo == null)
			return false;

		this.attrezzi.add(attrezzo);
		return true;
	}


	public int getPesoMax() {
		return pesoMax;
	}

	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		for(Attrezzo a : attrezzi) {
			if(a.getNome().equals(nomeAttrezzo)) {
				return a;
			}
		}
		return null;
	}

	public int getPeso() {
		int peso = 0;
		for (Attrezzo a : attrezzi)
			peso += a.getPeso();
		return peso;
	}

	public boolean isEmpty() {
		return this.attrezzi.size() == 0;
	}

	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}

	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		for(Attrezzo a : attrezzi) {
			if(a.getNome().equals(nomeAttrezzo)) {
				attrezzi.remove(a);
				return a;
			}
		}
		return null;
	}


	public String toString() {
		StringBuilder s = new StringBuilder();

		if (!this.attrezzi.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (Attrezzo a : attrezzi)
				s.append(a.toString()+" ");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}
	
	
	public List<Attrezzo> getContenutoOrdinatoPerPeso(){
		attrezzi.sort(new BorsaComparatorePesoNome());
		return attrezzi;
	}
	
	
	public SortedSet<Attrezzo> getContenutoOrdinatoPerNome(){
		this.ss = new TreeSet<>(new BorsaOrdinataPerNome());
		ss.addAll(attrezzi);
		return ss;
	} 
	
	public Map<Integer, Set<Attrezzo>> getContenutoRaggruppatoPerPeso(){
		Map<Integer, Set<Attrezzo>> mappa = new HashMap<>();
		for(Attrezzo a : attrezzi) {
			if(!mappa.containsKey(a.getPeso())) {
				mappa.put(a.getPeso(), new HashSet<>());
			}
			mappa.get(a.getPeso()).add(a);
		}
		return mappa;
	}
	
	public SortedSet<Attrezzo> getSortedSetOrdinatoPerPeso(){
		TreeSet<Attrezzo> ss2 = new TreeSet<>(new BorsaComparatorePesoNome());
		ss2.addAll(attrezzi);
		return ss2;
	}
	//---------------------------------------------------------------------------------//
	
	class BorsaComparatorePesoNome implements Comparator<Attrezzo>{

		@Override
		public int compare(Attrezzo a1, Attrezzo a2) {
			if(a1.getPeso() - a2.getPeso() == 0) {
				return a1.getNome().compareTo(a2.getNome());
			}
			return a1.getPeso() - a2.getPeso();
		}
	}
		
	class BorsaOrdinataPerNome implements Comparator<Attrezzo> {

		@Override
		public int compare(Attrezzo o1, Attrezzo o2) {
			return o1.getNome().compareTo(o2.getNome());

		}
	}
}