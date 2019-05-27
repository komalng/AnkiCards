package logic;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public String name;
    private List<Card> cards = new ArrayList<>();

    public Deck(String name) {
        this.name = name;
    }


    public void addCard(String front, String back){
        Card createCard = new Card(front,back);
        cards.add(createCard);
    }

    public List<Card> getCard(){
        return cards;
    }


}
