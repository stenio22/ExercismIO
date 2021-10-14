package vinteum;

public class Blackjack {

	public int ace = 11;
	public int two = 2;
	public int three = 3;
	public int four = 4;
	public int five = 5;
	public int six = 6;
	public int seven = 7;
	public int eight = 8;
	public int nine = 9;
	public int ten = 10;
	public int jack = 10;
	public int queen = 10;
	public int king = 10;
	public int other = 0;

	public int parseCard(String card) {
		if (card == "ace") {
			return ace;
		}
		if (card == "two") {
			return two;
		}
		if (card == "three") {
			return three;
		}
		if (card == "four") {
			return four;
		}
		if (card == "five") {
			return five;
		}
		if (card == "six") {
			return six;
		}
		if (card == "seven") {
			return seven;
		}
		if (card == "eight") {
			return eight;
		}
		if (card == "nine") {
			return nine;
		}
		if (card == "ten") {
			return ten;
		}
		if (card == "jack") {
			return jack;
		}
		if (card == "queen") {
			return queen;
		}
		if (card == "king") {
			return king;
		} else {
			return other;
		}
	}

	public boolean isBlackjack(String card1, String card2) {
		int primeiraCarta = parseCard(card1);
		int segundaCarta = parseCard(card2);
		if (primeiraCarta + segundaCarta == 21) {
			return true;
		} else {
			return false;
		}
	}

	public String largeHand(boolean isBlackjack, int dealerScore) {
		String Stand = "S";
		String Hit ="H";
		String Split ="P";
		String win = "W";
	
		if(isBlackjack == true) {
			if(dealerScore < 21 || dealerScore > 21) {
				return win;
			}
		}
			
		return Stand;
		
	
	
	}

	public String smallHand(int handScore, int dealerScore) {
		throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
	}

	// FirstTurn returns the semi-optimal decision for the first turn, given the
	// cards of the player and the dealer.
	// This function is already implemented and does not need to be edited. It pulls
	// the other functions together in a
	// complete decision tree for the first turn.
	public String firstTurn(String card1, String card2, String dealerCard) {
		int handScore = parseCard(card1) + parseCard(card2);
		int dealerScore = parseCard(dealerCard);

		if (20 < handScore) {
			return largeHand(isBlackjack(card1, card2), dealerScore);
		} else {
			return smallHand(handScore, dealerScore);
		}
	}
}
