public class Main {
    public static void main(String[] args) {
        // Create a deck of cards
        Deck deck = new Deck();

        // Add 52 cards to the deck
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(rank, suit);
                deck.addCard(card);
            }
        }

        // Shuffle the deck
        deck.shuffle();

        // Draw two cards from the top of the deck
        Card card1 = deck.drawCard();
        Card card2 = deck.drawCard();
        System.out.println("You drew the " + card1 + " and the " + card2 + ".");

        // Check if the cards have the same rank
        if (card1.getRank().equals(card2.getRank())) {
            System.out.println("You have a pair!");
        } else {
            System.out.println("You do not have a pair.");
        }
    }
}
