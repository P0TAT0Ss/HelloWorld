package org.testcollection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author Jue-PC
 */
public class TestHashSet {

    Set<String> Str;

    TestHashSet() {
        Str = new HashSet<>();
    }

    public void checkRepeat() {

        String[] strings = new String[1024];
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0;i<strings.length;i++) {
            while(str.length() != 2) {
                str.append((char)random.nextInt(110));
            }
            strings[i] = str.toString();
            str.delete(0,1);
        }

        int count = 0;
        for (String s :
                strings) {
            if (Str.contains(s)) {
                count++;
                System.out.println("Repeated element"+count+s);
            } else {
                Str.add(s);
            }
        }
        System.out.println("All repeat elements is: "+count);
    }

    public static void main(String[] args) {
        TestHashSet test = new TestHashSet();
        test.checkRepeat();
    }
}
