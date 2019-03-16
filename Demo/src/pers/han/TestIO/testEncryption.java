package pers.han.TestIO;
/**
 * testEncryption number and upperLetters and lowerLetters
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class testEncryption {

    List<Character> num;
    List<Character> upperChar;
    List<Character> lowerChar;


    String Str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String str = "abcdefghijklmnopqrstuvwxyz";
    String number = "0123456789";
    char[] lowerLetter;
    char[] upperLetter;
    char[] numbers;

    testEncryption() {

        upperLetter = Str.toCharArray();
        lowerLetter = str.toCharArray();
        numbers = number.toCharArray();
        num = new ArrayList<>();
        upperChar = new ArrayList<>();
        lowerChar = new ArrayList<>();
        for(char chars: upperLetter) {
            upperChar.add(chars);
        }
        for(char chars: lowerLetter) {
            lowerChar.add(chars);
        }
        for(char nums: numbers) {
            num.add(nums);
        }
    }

    public void fileEncryption(String encodingPath, String encodedPath) {


        File file = new File(encodingPath);
        try(FileReader reader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(reader);
            PrintWriter writer =
                    new PrintWriter(new BufferedWriter(new FileWriter(encodedPath)))
            ) {

            char[] buf = new char[(int)file.length()];
            bufReader.read(buf);
            for (char chars: buf) {
                System.out.print(chars);
            }
            char[] buffer = new char[(int)file.length()];

            for (int i = 0;i<file.length();i++) {
                if (upperChar.contains(buf[i])) {
                    if (buf[i] == upperChar.get(upperChar.size()-1)) {
                        buf[i] = upperChar.get(0);
                        buffer[i] = buf[i];
                    } else {
                        buffer[i] = (char)(buf[i]+1);
                    }
                } else if(lowerChar.contains(buf[i])) {
                    if (buf[i] == lowerChar.get(lowerChar.size()-1)) {
                        buf[i] = lowerChar.get(0);
                        buffer[i] = buf[i];
                    } else {
                        buffer[i] = (char)(buf[i]+1);
                    }
                } else if(num.contains(buf[i])) {
                    if (buf[i] == num.get(9)) {
                        buf[i] = num.get(0);
                        buffer[i] = buf[i];
                    } else {
                        buffer[i] = (char)(buf[i]+1);
                    }
                } else {
                    buffer[i] = buf[i];
                }
                System.out.print(buffer[i]);
            }

            writer.println(buffer);
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }




    }

    public void fileDecryption(String decrypting,String decrypted) {

        File file = new File(decrypting);
        try(FileReader reader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(reader);
            PrintWriter writer =
                    new PrintWriter(new BufferedWriter(new FileWriter(decrypted)))
        ) {

            char[] Chars = new char[(int)file.length()];
            bufReader.read(Chars);
            for (char chars: Chars) {
                System.out.print(chars);
            }
            char[] buffer = new char[(int)file.length()];
            for (int i = 0;i<file.length();i++) {
                if (upperChar.contains(Chars[i])) {
                    if (Chars[i] == upperChar.get(0)) {
                        Chars[i] = upperChar.get(upperChar.size()-1);
                        buffer[i] = Chars[i];
                    } else {
                        buffer[i] = (char)(Chars[i]-1);
                    }
                } else if(lowerChar.contains(Chars[i])) {
                    if (Chars[i] == lowerChar.get(0)) {
                        Chars[i] = lowerChar.get(lowerChar.size()-1);
                        buffer[i] = Chars[i];
                    } else {
                        buffer[i] = (char)(Chars[i]-1);
                    }
                } else if(num.contains(Chars[i])) {
                    if (Chars[i] == num.get(0)) {
                        Chars[i] = num.get(9);
                        buffer[i] = Chars[i];
                    } else {
                        buffer[i] = (char)(Chars[i]-1);
                    }
                } else {
                    buffer[i] = Chars[i];
                }
                System.out.print(buffer[i]);
            }
            writer.println(buffer);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        testEncryption encryption = new testEncryption();
        encryption.fileEncryption("F:/File.txt","F:/encryptedFile.txt");
        encryption.fileDecryption("F:/encryptedFile.txt","F:/decryptedFile.txt");

    }

}
