/* Daniel McFadden
 * Mr. Meistering
 * 10 March 2015
 * Elevens Lab
 */

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank = {"Jack", "Queen", "King"};
		String[] suit = {"Hearts", "Spades", "Diamonds"};
		int[] value = {11, 12, 13};
	    Deck a = new Deck(rank, suit, value);
	    System.out.println("Deck \"a\" size should be 9: " + a.size());
	    System.out.println("Deck \"a\" should not be empty: " + !a.isEmpty());
	    System.out.println("Deck \"a\" dealt card is: " + a.deal());
	    
	    String[] rankTwo = {"10", "Queen", "King"};
	    String[] suitTwo = {"Clubs", "Spades", "Diamonds"};
	    int[] valueTwo = {10, 12, 13};
	    Deck b = new Deck(rankTwo, suitTwo, valueTwo);
	    System.out.println("Deck \"b\" size should be 9: " + b.size());
	    System.out.println("Deck \"b\" should not be empty: " + !b.isEmpty());
	    System.out.println("Deck \"b\" dealt card is: " + b.deal());
	    
	    String[] rankThree = {"1", "3", "Queen"};
	    String[] suitThree = {"Diamonds", "Spades", "Hearts"};
	    int[] valueThree = {1, 3, 12};
	    Deck c = new Deck(rankThree, suitThree, valueThree);
	    System.out.println("Deck \"c\" size should be 9: " + c.size());
	    System.out.println("Deck \"c\" should not be empty: " + !c.isEmpty());
	    System.out.println("Deck \"c\" dealt card is: " + c.deal());
	   
	    
	    System.out.println("**** Shuffle card****");
	    
        String[] ranks2 = new String[52];
        String[] suits2 = new String[52];
        int[] pointValues2 = new int[52];
        for (int i = 0; i < 52; i++) {
            String rank1 = "";
            String suit1 = "";
            if ( (i+1) % 13 == 11 ) {
                rank1 = "Jack";
            }
            else if ( (i+1) % 13 == 12 ) {
                rank1 = "Queen";
            }
            else if ( (i+1) % 13 == 0 ) {
                rank1 = "King";
            }
            else if ( (i+1) % 13 == 1 ) {
                rank1 = "Ace";
            }
            else {
                rank1 = Integer.toString((i + 1) % 13);
            }
            
            if (i < 13) {
                suit1 = "Hearts";
            }
            else if (i < 26) {
                suit1 = "Diamonds";
            }
            else if (i < 39) { 
                suit1 = "Clubs";
            }
            else {
                suit1 = "Spades";
            }
            ranks2[i] = rank1;
            suits2[i] = suit1;
            pointValues2[i] = ((i+1) % 13);
        }
        
        Deck e = new Deck(ranks2, suits2, pointValues2);
        System.out.println(e);

	}
}