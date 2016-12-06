public class Wochenkalender
{
	String[][] kalender;

	public Wochenkalender()
	{
		kalender = new String[24][8];

		System.out.println(kalender.length);

		for(int i = 0; i<kalender.length; i++)
			for(int j=0; j<kalender[i].length; j++)
				kalender[i][j] = " ";
	}

	public String abfragenTermin(int tag, int stunde)
	{
		return kalender[stunde][tag];
	}

	public void eintragenTermin(int tag, int vonStunde, String eintrag)
	{
		kalender[vonStunde][tag] = eintrag;
	}

	public void eintragenLangtermin(int tag, int vonStunde, int bisStunde, String eintrag)
	{
		for(int i=vonStunde; i<=bisStunde; i++)
		{
			kalender[i][tag] = eintrag;
		}
	}

	public void eintragenSerientermin(int vonStunde, String eintrag)
	{
		for(int i=0; i<7; i++)
		{
			kalender[vonStunde][i] = eintrag;
		}
	}

	public void entferneTermin(int tag, int vonStunde)
	{
		kalender[vonStunde][tag] = " ";
	}
}