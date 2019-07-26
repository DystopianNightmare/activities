
public class Card implements Comparable<Card> {

	private Rank rank;
	private Suit suit;

	public  Card(Suit suit, Rank rank) {
		this.rank = rank;
		this.suit = suit;
		
	}
	
	public int getValue() {
		
		return rank.getFaceValue();
				
	}
	
	


	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		if (this.getValue() == o.getValue()) {
			return 0;
		} if (this.getValue() > o.getValue()) {
			return 1;
	} else {
		return -1;
	}
	}

public String toString() {
	String s = (rank + " of " + suit + ", ");
	return s;
}


	public Suit getSuit() {
		return suit;
	}





	public void setSuit(Suit suit) {
		this.suit = suit;
	}





	public Rank getRank() {
		return rank;
	}





	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
}
