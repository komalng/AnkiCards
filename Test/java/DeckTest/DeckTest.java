package DeckTest;
import logic.Card;
import logic.Deck;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    @Test public void shouldCreateDeck(){
        Deck deck = new Deck("Programming");
        assertEquals("Programming",deck.name);
    }
}
