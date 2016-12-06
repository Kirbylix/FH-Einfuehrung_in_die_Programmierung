public abstract class Mitarbeiter
{
	// Attribute
	private static int anzahlMitarbeiter = 0;

	private String name;
	private int personalnummer;

	// Konstruktor
	public Mitarbeiter(String name)
	{
		this.name = name;
		anzahlMitarbeiter++;
		this.personalnummer = anzahlMitarbeiter;
	}

	public abstract double berechneGehalt();

	public void setName(String neuerName)
	{
		this.name = neuerName;
	}

	public String getName()
	{
		return this.name;
	}

   	public int getPersonalnummer()
   	{
   		return this.personalnummer;
   	}
}
