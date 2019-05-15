package test1.Demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        boolean keepDoing = true;
        while (keepDoing) {
            Scanner scan = new Scanner(System.in);
            List<Integer> pokers = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= 13; j++) {
                    pokers.add(j);
                }
            }
            try {
                int N1Poker1 = scan.nextInt();
                pokers.remove(N1Poker1);
                int N1Poker2 = scan.nextInt();
                pokers.remove(N1Poker2);
                int N1Poker3 = scan.nextInt();
                pokers.remove(N1Poker3);
                int N2Poker1 = scan.nextInt();
                pokers.remove(N2Poker1);
                int N2Poker2 = scan.nextInt();
                pokers.remove(N2Poker2);
                int N2Poker3 = scan.nextInt();
                pokers.remove(N2Poker3);


                int N1Score = N1Poker1 + N1Poker2 + N1Poker3;
                int N2Score = N2Poker1 + N2Poker2 + N2Poker3;
                int diff;
                double count = 0;
                if (N1Score != N2Score) {
                    diff = N2Score - N1Score;
                } else {
                    diff = 0;
                }
                for (int i = 0; i < pokers.size(); i++) {
                    for (int j = 0; j < pokers.size(); j++) {
                        if ((pokers.get(j) - pokers.get(i)) > diff) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
                double chance = count / (46 * 45);
                System.out.println(chance);
                NumberFormat ft = NumberFormat.getNumberInstance();
                ft.setMaximumFractionDigits(4);
                System.out.println(ft.format(chance));
                keepDoing = false;
            } catch (Exception e) {
                System.out.println("out of bounds");
            }
        }
    }
}
