package pers.han.pokerGame;


public class pokerCard implements Comparable<pokerCard> {

    private String suit;
    private String value;
    private Integer worth;

    pokerCard() {
    }


    public void setSuit(String suit) {
        this.suit = suit;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public void setWorth(int worth) {
        this.worth = worth;
    }

    public String getSuit() {
        return suit;
    }
    public String getValue() {
        return value;
    }
    public Integer getWorth() {
        return worth;
    }

    @Override
    public int compareTo(pokerCard o) {
        return this.getWorth().compareTo(o.getWorth());
    }

}
