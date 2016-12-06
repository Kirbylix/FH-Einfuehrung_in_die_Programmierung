public class VersicherungA implements VersicherungI
{
	// Implementierung der abstrakten Methode mit switch
	public double berechnePraemie(double vsumme)
  	{
        // Berechnung
		double praemie = 0.0;

	    // Lösung mit switch - case - Konstrukt
		int schalter = (int)((vsumme - 1.0/100.0) / 5000.0);
		switch (schalter)
		{
			case 0: praemie = vsumme * 16.8 / 1000.0; break;
			case 1: praemie = vsumme * 12.6 / 1000.0; break;
			default: praemie = vsumme * 8.4 / 1000.0; break;
		}
        return (double)Math.floor((double)(praemie * 100.0)) / 100.0;
	}

	public double berechneSonderpraemie(double vsumme)
	{
		double spraemie = 0.0;

		spraemie = vsumme * 0.002;
        return (double)Math.floor((double)(spraemie * 100.0)) / 100.0;
	}
}
