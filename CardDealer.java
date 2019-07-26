
public class CardDealer {

	
	
	public static void main(String args[]) {
		
		
		DeckOfCards newDeck = new DeckOfCards();
		System.out.println(newDeck);
		newDeck.shuffle();
		System.out.println(newDeck);
		System.out.println("");
		System.out.println("Drawing 3 cards: ");
		System.out.println("");
		newDeck.draw();
		newDeck.draw();
		newDeck.draw();
		System.out.println("");
		System.out.println("dealt cards: " + newDeck.numCardsDealt());
		System.out.println("");
		newDeck.dealtCards();
		System.out.println("");
		System.out.println("remaining cards: " + newDeck.numCardsRemaining());
		System.out.println("");
		newDeck.remainingCards();
		
		
		
	}
}
