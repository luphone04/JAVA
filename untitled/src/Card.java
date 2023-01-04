public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        // Construct a card with the given rank and suit
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        // Get the rank of the card
        return rank;
    }

    public String getSuit() {
        // Get the suit of the card
        return suit;
    }

    @Override
    public String toString() {
        // Return a string representation of the card
        return rank + " of " + suit;
    }
}
