import java.util.Random;

public class DeckOfCards implements DeckOfCardsInterface {

	private Card[] cards, dealtCards,remainingCards;
	private int deckSize = 52;
	private int nextCardIndex, numCardsRemaining, numCardsDealt, newCount;
	private Rank rank;
	private Suit suit;

	public DeckOfCards() {


		int i = 0;
		cards = new Card[deckSize];
		for (Suit s: Suit.values())  {
			for (Rank r: Rank.values())  {
				cards[i] = new Card(s, r);
				i++;			
			}
		}

	}

	public String toString() {
		String a = "";
		for (Card c: cards) {

			a += c.toString();
		}
		return a;

	}
	



	@Override
	public void shuffle() {
		for (int a = nextCardIndex; a < cards.length; a++ ) {
			Random rand = new Random();
			int j = rand.nextInt(52);
			swap(a,j);
			
		}
			nextCardIndex = 0;
	}
	private void swap(int a, int b) {
		Card c = cards[a];
		Card d = cards[b];
		this.cards[a] = d;
		this.cards[b] = c;
	}
	
	@Override
	public Card draw() {
		if (nextCardIndex == cards.length) {
			return null;
		}
		Card a = cards[nextCardIndex];
		nextCardIndex++;
		
		System.out.println(a);
		//System.out.println(dealtCards.toString());
		return a;
	}

	@Override
	public int numCardsRemaining() {
		 numCardsRemaining = cards.length - nextCardIndex;
		 
		 return numCardsRemaining;
	}

	@Override
	public int numCardsDealt() {
		numCardsDealt = nextCardIndex;
		
		return numCardsDealt;
	}

	@Override
	public Card[] dealtCards() {
		dealtCards = new Card[nextCardIndex +1];
		int i = 0;
		for ( int a = 0; a < nextCardIndex; a++) {
			dealtCards[a] = cards[i];
					i++;
					System.out.println(dealtCards[a]);
		} 
		return dealtCards;
		
		
	}

	@Override
	public Card[] remainingCards() {
		
		numCardsRemaining();
		remainingCards = new Card[numCardsRemaining];
		int c = 0;
		for (int b = nextCardIndex ; b < cards.length; b++) {
			remainingCards[c] = cards[b];
			
			System.out.println(remainingCards[c]);
			c++;
		} return remainingCards;
		
	}




























}
