package pers.han.DDrent;

/**
 * DDCarRent
 * @author han
 */

import java.util.Scanner;

public class Client {

    public static void confirm(Cars[] car) {

        Scanner scan = new Scanner(System.in);

            System.out.println("\n\tWELCOME~\nDo you need cars?\n\tYES:1,NO:0");

            try {
                Object get = scan.next();
                if (get.equals("1")) {
                    System.out.println("Here is car list\nnumber\\tName\\tpersonCapacity\\tgoodsCapacity\\tprice");
                    for (Cars c:car) {
                        c.show();
                    }
                }else if(get.equals("0")) {
                    System.out.println("bye~~~");
                }else {
                    throw new OutOfSelecton();
                }
            }catch (OutOfSelecton e) {
                System.out.println("OUT OF SELECTION!!!!\nPLEASE CHECK YOUR CHOICE");
                confirm(car);
            }
    }

    public static void select(Cars[] car) {

        double price = 0;
        Scanner scan = new Scanner(System.in);
        try {
            /**
             * chose sequence list.
             */
            String[] Num = {"First","Second","Third","Forth","Fifth","Sixth"};
            /**
             * set car number.
             */
            System.out.println("How many cars?");
            int carNum = scan.nextInt();
            if (carNum < 0){
                //throw Out of selection exception;
                throw new OutOfSelecton();
            }
            /**
             * set day number
             */
            System.out.println("How many days?");
            int dayNum = scan.nextInt();
            if (dayNum < 0) {
                //throw Out of selection exception;
                throw new OutOfSelecton();
            }
            /**
             * get car and sumPrice.
             */
            for(int i = 0;i<carNum;i++) {
                System.out.println("Now chose your "+Num[i]+" car");
                int  input = scan.nextInt();
                price += car[input-1].price*carNum*dayNum;
            }

        }catch(OutOfSelecton e) {
            System.out.println("Illegal input!!!");
            select(car);

        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Non-Existent");
            select(car);

        }finally {
            // confirm client quit behavior;
            System.out.println("you need cost "+price+".USD\nDo you still need cars ?\n\tYES: 1\tNO: 0");
            if (scan.next().equals("1")) {
                select(car);
            }else {
                System.out.println("THANK YOU!");
            }
        }
    }

    public static void main(String[] args) {
        /**
         * set cars.
         */
        Cars T1 = new Trunk(1,"Trunk.1\t",2,8.21,300);
        Cars T2 = new Trunk(2,"Trunk.2\t",2,12,400);
        Cars T3 = new Trunk(3,"Trunk.3\t",4,10,700);
        Cars C1 = new Coach(4,"Coach.1\t",8,0,500);
        Cars C2 = new Coach(5,"Coach.2\t",4,0,800);
        Cars P1 = new Pickup(6,"Pickup.1\f\f",5,5,900);

        Cars[] car = {T1,T2,T3,C1,C2,P1};

        /**
         * start flow.
         */
        confirm(car);
        select(car);
    }



}
