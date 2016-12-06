package Beispiel.Ma;

import Beispiel.Abt.*;

public class Manager extends Mitarbeiter
{
   	private double festgehalt;
   	private double provision;
   	private double umsatz;

	public Manager(String name, double festgehalt, double provision, Abteilung abt)
	{
		super(name, abt);
		this.festgehalt = festgehalt;
		this.provision = provision;
	}

	public void setUmsatz(double umsatz)
	{
		this.umsatz = umsatz;
	}

   	public double berechneGehalt()
   	{
      	return this.festgehalt + this.umsatz * this.provision;
   	}
}

