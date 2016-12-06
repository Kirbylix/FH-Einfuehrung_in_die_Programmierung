public class Geschaeftsfuehrer extends Manager
{
    double zulage;

	public Geschaeftsfuehrer(String name, double festgehalt, double provision, double zulage)
	{
		super(name, festgehalt, provision);
		this.zulage = zulage;
	}

    public double berechneGehalt()
    {
        return super.berechneGehalt() + this.zulage;
    }
}
