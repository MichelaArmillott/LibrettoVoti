package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.*;
public class TestLibretto {
	public static void main(String[]args) {
		System.out.println("test metodi di libretto");
Libretto libretto=new Libretto();

Voto voto1=new Voto("analisi 1",30,LocalDate.of(2019, 2, 15));

libretto.add(voto1);
libretto.add(new Voto("fisica 1",28,LocalDate.of(2019,7,15)));
libretto.add(new Voto("informatica",24,LocalDate.of(2019,9,15)));
libretto.add(new Voto("chimica",25,LocalDate.of(2019,2,18)));
System.out.println(libretto);

List<Voto> venticinque=libretto.listaVotiUguali(25);
System.out.println(venticinque);

Libretto librettoventicinque=libretto.votiUguali(25);
System.out.println(librettoventicinque);
}}
