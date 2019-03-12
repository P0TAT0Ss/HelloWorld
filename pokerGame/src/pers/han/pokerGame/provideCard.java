package pers.han.pokerGame;

/**
 * Poker game
 * Creat cards
 * Shuffle cards
 * Provide three cards each player
 * Get max one card of each player
 * Compare and get winner
 *
 * @author han
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class provideCard {

    Scanner scan;
    Scanner scanner;
    Players Player;
    cardList Cards;

    provideCard() {

        scan = new Scanner(System.in);
        scanner = new Scanner(System.in);
        Player = new Players();
        Cards = new cardList();
    }

    public void setPlayer() {

        System.out.println("\nInput players number");
        int num = scanner.nextInt();

        for (int i = 0;i<num;i++) {

            Players player = new Players();

            System.out.println("Input No."+(i+1)+" name");
            String name = scan.nextLine();
            player.setName(name);

            Player.players.add(player);

        }

    }

    public void provide() {

        Cards.setCards();
        System.out.println("\nStart provide");
        for (int i = 0;i<3;i++){
            for (Players players: Player.players) {
                players.player_Cards.add(Cards.cardsList.get(0));
                Cards.cardsList.remove(0);
                System.out.println(players.getName()+"\tGet card!");
            }
        }


    }

    public void compare() {


        System.out.println("\nGO!");


        List<pokerCard> maxWorth = new ArrayList<>();

        for (Players players : Player.players) {

            Collections.sort(players.player_Cards);
            maxWorth.add(players.player_Cards.get(players.player_Cards.size() - 1));

        }
        //sort and get max
        Collections.sort(maxWorth);
        pokerCard temp = maxWorth.get(maxWorth.size() - 1);
        //players
        for (Players players : Player.players) {
            //get players's cards
            for (pokerCard cards : players.player_Cards) {
                System.out.println(players.getName() + "'s cards is: " + cards.getSuit() + "\t" + cards.getValue());
            }


            //determine winner
            if (players.player_Cards.contains(temp)) {
                try {
                    for (int i = 5; i >= 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }

                }catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Congratulations!! " + players.getName() + " Win");
            } else {
            }
        }

    }

    public static void main(String[] args) {

        provideCard provide = new provideCard();
        provide.setPlayer();
        provide.provide();
        provide.compare();

    }

}
