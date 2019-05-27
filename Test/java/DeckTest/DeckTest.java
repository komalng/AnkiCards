package DeckTest;
import logic.Card;
import logic.Deck;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeckTest {
    @Test public void shouldCreateDeck(){
        Deck deck = new Deck("Programming");
        assertEquals("Programming",deck.name);
    }
    @Test public void shouldCreateFrontAndBackCard(){
        Card frontBack = new Card("ssh","Secure Shell");
        assertEquals("ssh,Secure Shell",frontBack.toString());
    }
    @Test public void shouldAddCardInDeck(){
        Deck deck = new Deck("Programming");
        Card createCard = new Card("ssh","Secure Shell");
        List<Card> expected = new ArrayList<>();
        expected.add(createCard);
        deck.createCard("ssh","Secure Shell");
        assertEquals(expected.get(0),deck.getCards().get(0));

    }

}
