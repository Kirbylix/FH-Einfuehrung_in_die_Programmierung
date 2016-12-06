/**
 * @(#)BruchTest.java
 *
 * BruchTest application
 *
 * @author Kai Kappis
 * @version 1.00 2014/10/31
 */

public class BruchTest {
	/**
     * Hauptprogramm.
     *
     * @param args Kommandozeilenparameter
     */
    public static void main(String[] args) {

    Bruch bruch1 = new Bruch(1,2);
    Bruch bruch2 = new Bruch(3,4);
    Bruch bruch3 = new Bruch(5,6);
    Bruch bruch4 = new Bruch(9,10);
    Bruch bruch5 = new Bruch(7,8);
    Bruch bruch6 = new Bruch(3,7);

	System.out.print(bruch1.toString() + " * 3 = ");
    bruch1.multipliziere(3);
    System.out.println(bruch1.toString());

	System.out.print(bruch2.toString() + " * " + bruch3.toString() + " = ");
    bruch2.multipliziere(bruch3);
	System.out.println(bruch2.toString());

	System.out.print(bruch4.toString() + " / " + bruch5.toString() + " = ");
	bruch4.dividieren(bruch5);
	System.out.println(bruch4.toString());

	System.out.print(bruch6.toString() + " / " + bruch6.toString() + " = ");
	bruch6.dividieren(bruch6);
	System.out.println(bruch6.toString());
    }
}
