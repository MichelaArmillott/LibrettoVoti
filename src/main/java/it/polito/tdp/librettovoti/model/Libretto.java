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
}
