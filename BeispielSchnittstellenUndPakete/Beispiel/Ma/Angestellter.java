package Beispiel.Ma;

import Beispiel.Abt.*;

public class Angestellter extends Mitarbeiter
{
   	private double grundgehalt;
   	private double ortszuschlag;
   	private double zulage;

   	public Angestellter(String name, double grundgehalt, double ortszuschlag, double zulage, Abteilung abt)
   	{
   		super(name, abt);
   		this.grundgehalt = grundgehalt;
   		this.ortszuschlag = ortszuschlag;
   		this.zulage = zulage;
   	}

   	public double berechneGehalt()
   	{
      	return this.grundgehalt + this.ortszuschlag + this.zulage;
   	}
}

