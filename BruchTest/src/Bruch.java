/**
 * Klasse Bruch
 *
 * @author Kai Kappis
 * @version 1.0
 */

public class Bruch {

	/** Zaehler des Bruches */
	private int _zaehler;
	/** Nenner des Bruches */
	private int _nenner;

	/** Konstruktor
     * @parm sZaehler Zaehler
     */
	public Bruch(int sZaehler) {
		this._zaehler = sZaehler;
		this._nenner = 0;
    }

	/** Konstruktor
     * @parm sZaehler Zaehler
     * @parm sNenner Nenner
     */
    public Bruch(int sZaehler, int sNenner) {
    	this._zaehler = sZaehler;
		this._nenner = sNenner;
    }

    /** Zaehler Getter
     * @return Zaehler als int
     */
    public int getZaehler(){
    	return this._zaehler;
    }

	/** Nenner Getter
     * @return Nenner als int
     */
    public int getNenner(){
    	return this._nenner;
    }

    /** Multiplikation mit einer Ganzzahl
     * @parm n Multiplikator
     */
    public void multipliziere(int n){
    	this._zaehler = n*this._zaehler;
    	this._nenner = 1*this._nenner;
    }

	/** Multiplikation mit einem Bruch
     * @parm b Bruch
     */
    public void multipliziere(Bruch b){
    	this._zaehler = b.getZaehler()*this._zaehler;
    	this._nenner = b.getNenner()*this._nenner;
    }

	/** Division durch einen Bruch
     * @parm b Bruch
     */
    public void dividieren(Bruch b){
    	int zaehler2 = b.getZaehler();
    	int nenner2 = b.getNenner();

    	this._zaehler = nenner2*this._zaehler;
    	this._nenner = zaehler2*this._nenner;
    }

	/** Umwandlung des Bruches in einen String
     * @return Bruch als String
     */
    public String toString(){

    	if(this._zaehler == this._nenner){
    		return "1";
    	}else{
    		return this._zaehler + "/" + this._nenner;
    	}

    }


}