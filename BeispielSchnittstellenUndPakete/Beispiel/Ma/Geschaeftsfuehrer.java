package Beispiel.Ma;

import Beispiel.Abt.*;

public class Geschaeftsfuehrer extends Manager
{
    double zulage;

	public Geschaeftsfuehrer(String name, double festgehalt, double provision, double zulage, Abteilung abt)
	{
		super(name, festgehalt, provision, abt);
		this.zulage = zulage;
	}

    public double berechneGehalt()
    {
        return super.berechneGehalt() + this.zulage;
    }
}
