package pers.han.pokerGame;


import java.util.ArrayList;
import java.util.List;

public class Players {

    private String name;
    List<pokerCard> player_Cards;
    List<Players> players;

    Players() {

        player_Cards = new ArrayList<>();
        players = new ArrayList<>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
