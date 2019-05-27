package logic;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public String name;
    public List<Card> cards = new ArrayList<>();

    public Deck(String name) {
        this.name = name;
    }
}
