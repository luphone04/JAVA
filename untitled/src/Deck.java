import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        // Initialize an empty deck of cards
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        // Add a card to the deck
        cards.add(card);
    }

    public void shuffle() {
        // Shuffle the deck of cards
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        // Draw a card from the top of the deck
        return cards.remove(0);
    }

    public int size() {
        // Return the number of cards in the deck
        return cards.size();
    }
}
