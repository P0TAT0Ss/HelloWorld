package pers.han.pokerGame;

/**
 * Determine play or not
 * Set poker cards
 * Shuffle cards
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class cardList {

    private Scanner scanner;
    private Scanner scan;
    pokerCard card;
    List<pokerCard> cardsList;

    cardList() {

        scan = new Scanner(System.in);
        scanner = new Scanner(System.in);
        cardsList = new ArrayList<>();

    }

    public void setCards() {



        while(true) {

            System.out.println("Welcome\nPlay or just watch?\n\t" +
                    "Play: Y\tNot yet: N");
            String input = scan.nextLine();
            if (input.equals("y")) {
                String[] suit = {"Spade","Heart","Diamond","Club"};
                String[] value = {"A","2","3","4","5","6",
                        "7","8","9","10","J","Q","K"};
                int [] worth = {12,13,1,2,3,4,5,6,7,8,9,10,11};
                for (String stringS :
                        suit) {
                    for (int i = 0;i<value.length;i++) {
                        //creat new pokerCard object accept suit and value
                        card = new pokerCard();
                        card.setSuit(stringS);
                        card.setValue(value[i]);
                        card.setWorth(worth[i]);
                        //add pokerCard object to list
                        cardsList.add(card);
                    }
                }

                card = new pokerCard();
                card.setWorth(15);
                card.setValue("JOKER");
                card.setSuit("Red");
                cardsList.add(card);

                card = new pokerCard();
                card.setWorth(14);
                card.setValue("JOKER");
                card.setSuit("Black");
                cardsList.add(card);

                System.out.println(cardsList.size()+
                        " Cards deployed");
                for (pokerCard cards :
                        cardsList) {
                    System.out.print(cards.getSuit()+" "
                            +cards.getValue()+"\t");
                }

                while (true) {
                    System.out.println("\n\nShuffling cards");
                        Collections.shuffle(cardsList);

                    for (pokerCard cards :
                            cardsList) {
                        System.out.print(cards.getSuit()+" "
                                +cards.getValue()+"\t");
                    }
                    System.out.println("Success!!!\nDo you want to shuffle once more?" +
                            "\n\tYes: Y\tNo: N");
                        String In = scan.nextLine();

                    if (In.equals("y")) {
                        continue;

                    } else if (In.equals("n")) {
                        break;

                    } else {
                        System.out.println("Input illegal\nPlease Input again");
                        Collections.sort(cardsList);
                        continue;
                    }
                }
                break;

            } else if (input.equals("n")){
                System.out.println("See you next time");
            } else {
                System.out.println("Input illegal please");
                continue;
            }
        }

    }


}
