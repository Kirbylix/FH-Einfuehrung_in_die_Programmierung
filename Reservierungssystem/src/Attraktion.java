
public class Attraktion {
	private String name;
	private double eintrittspreis;
	private int ersterEinlass;
	private int maxBesucher;
	private Ticket ticket = new Ticket(365,24,maxBesucher);
	
	/**
	 * Konstruktor
	 */
	public Attraktion(String name, double eintrittspreis, int ersterEinlass, int maxBesucher)
	{
		this.name = name;
		this.eintrittspreis = eintrittspreis;
		this.ersterEinlass = ersterEinlass;
		this.maxBesucher = maxBesucher;
		
	}
	

	public String getName()
	{
		return this.name;
	}
	

	public boolean buchen(Reisegruppe reisegruppe, int tag, int stunde)
	{
		char[][] test = new char[10][12];
		
		
		return false;
	}
	
	public void ausgebenTag(int tag)
	{
		
	}
	
	
}
