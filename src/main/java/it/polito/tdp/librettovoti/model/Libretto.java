package it.polito.tdp.librettovoti.model;
import java.util.*;
public class Libretto {
	private ArrayList<Voto>voti=new ArrayList<Voto>();
	
	public void add(Voto v) {
		voti.add(v);
	}
   
	public String toString() {
		String s="";
		for(Voto v:voti) {
			s=s+v.toString()+"\n";
		} return s;
	}
	
	public List listaVotiUguali(int punteggio) {
		ArrayList <Voto>stampa=new ArrayList<Voto>();
		for(Voto v:voti) {
			if(v.getVoto()==punteggio)
				stampa.add(v);
		}
		return stampa;
	}
	
	public Libretto votiUguali(int voto) {
		Libretto stampa=new Libretto();
		for(Voto v:voti) {
			if(v.getVoto()==voto)
				stampa.add(v);
		}
		return stampa;
	}
}
