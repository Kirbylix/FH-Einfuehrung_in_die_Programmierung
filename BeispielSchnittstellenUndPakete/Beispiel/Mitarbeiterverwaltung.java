package Beispiel;

import Beispiel.Abt.*;
import Beispiel.Ma.*;


public class Mitarbeiterverwaltung
{
	public static void main(String[] args)
	{
		
		Abteilung abt1, abt2;
		Angestellter ang1, ang2, ang3;
		Manager mg1, mg2;
		
		abt1 = new Abteilung("Entwicklung");
		abt2 = new Abteilung("Vertrieb");

		// Mitarbeiter erzeugen und Assoziation zur jeweiligen Abteilung aufbauen
		ang1 = new Angestellter("Marc", 3000, 175, 50, abt1);
		ang2 = new Angestellter("Paul", 2500, 150, 50, abt2);
		ang3 = new Angestellter("Karin",2700, 160, 50, abt1);
		mg1 = new Manager("Sven", 4000, 100, abt1);
		mg1.setUmsatz(20);
		mg2 = new Manager("Susanne", 5000, 100, abt2);
		mg2.setUmsatz(55);
				
		// Test der Methoden
		System.out.println(ang1.getName()+" und "+ang2.getName()+" sind Kollegen: "+ang1.isKollege(ang2));
		System.out.println(mg2.getName()+" und "+ang2.getName()+" sind Kollegen: "+mg2.isKollege(ang2));
	
		System.out.println("Die Kollegen von "+ang3.getName()+" sind:");
		Mitarbeiter[] mliste;
		mliste = ang3.bestimmeKollegen();
		if(mliste != null)
		{
			for (int i=0; i<mliste.length; i++)
			{
				System.out.println(mliste[i].getName());
			}
		}
		
		System.out.println("Gehaltskosten");
		System.out.println("Abteilung " + abt1.getBezeichnung() + " " + abt1.berechneGehaltskosten());	
		System.out.println("Abteilung " + abt2.getBezeichnung() + " " + abt2.berechneGehaltskosten());	
	}
}