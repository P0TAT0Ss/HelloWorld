package pers.han.StuSys;


import java.util.*;

public class listSort {

    List<Integer> integerList;
    List<String> stringList;
    Scanner scan;
    Scanner scanner;
    courseList courselist;
    /**
     * initialize Object of listSort
     */
    listSort() {

        integerList = new ArrayList<>();
        stringList = new ArrayList<>();
        scan = new Scanner(System.in);
        scanner = new Scanner(System.in);
        courselist = new courseList();

    }

    public void sortNum() {

        System.out.println("Input elements number");
        int num = scanner.nextInt();

        Random random = new Random();
        Integer k;
        int count = 0;
        for (int i = 0;i<num;i++) {

            /**
             * # Creat no repeat random number
             * While integerList contains created number
             * Recreated
             */
            do {
                k = random.nextInt(1000);
            } while(integerList.contains(k));

            integerList.add(k);
        }
        System.out.print("Success!!");

        System.out.println("Before:");
        for (Integer integer:
                integerList) {
            System.out.print(integer+", ");
        }

        Collections.sort(integerList);
        System.out.println("\nAfter: ");
        for (Integer integer :
                integerList) {
            System.out.print(integer+", ");
        }

    }

    public void sortString() {

        System.out.println("Input String number");
        int num = scanner.nextInt();
        String str;

        for (int i = 0;i<num;i++) {

            System.out.println("Input your No. "+(i+1)+"string");

            do {
                str = scan.nextLine();
            }while (stringList.contains(str));

                stringList.add(str);
            System.out.println("Success!");
        }

        System.out.println("Before");
        for (String string :
                stringList) {
            System.out.print(string+" || ");
        }

        Collections.sort(stringList);

        System.out.println("\nAfter");
        for (String string :
                stringList) {
            System.out.print(string+"\t");
        }

    }

    public void sortRandomString() {

        System.out.println("Input string number: ");
        int num = scanner.nextInt();

        System.out.println("Input string length: ");
        int length = scanner.nextInt();

        Random random = new Random();

        //better than String
        StringBuilder string;
        char c;

        //control string number
        for (int i = 0;i<num;i++) {

            //determine repeat
            do {
                //initialize string
                string = new StringBuilder();

                //control String.length
                for (int j = 0;j<length;j++) {
                    c = (char) random.nextInt();
                    //useless determine...
                    if (!(c == ' ')) {
                        string.append(c);
                    } else {
                        j--;
                        continue;
                    }
                }
            } while (stringList.contains(string.toString()));

            stringList.add(string.toString());
        }

        //traverse and determine number, length
        System.out.println("Success!\n" + "Before\n" );
        for (String str :
                stringList) {
            System.out.println("String:\t"+str+"\tString.length:\t"+str.length());
        }System.out.println("String number:\t"+stringList.size());

        //sort stringList by method sort class Collections
        Collections.sort(stringList);
        System.out.println("Sorted!\nAfter: ");
        for (String str :
        stringList) {
            System.out.println("String:\t"+str);
        }

    }
    
    public void sortObjectCourse() {

        System.out.println("Before:");
        Collections.shuffle(courselist.coursesToSelect);
        for (Course course :
                courselist.coursesToSelect) {
            System.out.println("\nCourse ID:\t"+course.getId()+"\n\tCourse name:\t"+course.getName());
        }

        while(true) {
            System.out.println("Which sort method do you need\n\t" +
                    "1: Sort by ID\t2: Sort by name");
            String input = scan.nextLine();
            if (input.equals("1")) {
                System.out.println("After:");
                Collections.sort(courselist.coursesToSelect);
                for (Course course :
                        courselist.coursesToSelect) {
                    System.out.println("\nCourse ID:\t"+course.getId()+"\n\tCourse name:\t"+course.getName());
                }
                break;
            } else if (input.equals("2")) {
                System.out.println("After:");
                for (Course course :
                        courselist.coursesToSelect) {
                    System.out.println("\nCourse ID:\t"+course.getId()+"\n\tCourse name:\t"+course.getName());
                }
                break;
            } else
                continue;
        }

    }

    public static void main(String[] args) {

        listSort sort = new listSort();
        sort.sortObjectCourse();

    }

}
