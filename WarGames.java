
public class WarGames {

	//private Card player1, player2; 
	
	
	public static void main(String[] args) {
		String stringOfRounds = args[0];
		int numOfRounds = Integer.parseInt(stringOfRounds);
		
		DeckOfCards deck = new DeckOfCards();

		
		deck.shuffle();
		
		for(int i = 0; i < numOfRounds; i++)  {
			System.out.println("");
			System.out.println("round: " + i + "...");
		Card player1 = deck.draw();
		Card player2 = deck.draw();
		
		if (player1.compareTo(player2) == 1) {
			System.out.println("Player1 wins");
		} else if (player1.compareTo(player2) == -1) {
			System.out.println("Player2 wins");
		} else {
			System.out.println("Its a tie.");
		}
		}
	}

}
