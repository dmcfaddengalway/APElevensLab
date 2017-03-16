/* Daniel McFadden
 * Mr. Meistering
 * 10 March 2015
 * Elevens Lab
 */

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("King", "Heart", 10);
		Card b = new Card("King", "Spade", 10);
		Card c = new Card("Queen", "Heart", 10);
		
		System.out.println(c.toString());
		System.out.println(a.suit());
		System.out.println(b.rank());
		System.out.println(c.pointValue());
		System.out.println("Card 1 and Card 2 should match: " + b.matches(a));
		System.out.println("Card 2 and Card 3 should not match: " + !b.matches(c));
	}
}