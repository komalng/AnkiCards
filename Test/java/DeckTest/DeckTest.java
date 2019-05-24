package DeckTest;
import logic.Deck;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    @Test public void shouldCreateDeck(){
        Deck name = new Deck("Programming");
        assertEquals("Programming",name.name);
    }
}
