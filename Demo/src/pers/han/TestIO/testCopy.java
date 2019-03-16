package pers.han.TestIO;

/**
 * Copy allFile include files of subFolder to new folder
 */

import java.io.*;

public class testCopy {

    public testCopy() {

    }

    public void copyFile(String path) {

        int len;
        File file = new File(path);

        if (file.isFile()) {
            try (
                    BufferedInputStream bufInput = new BufferedInputStream(new FileInputStream(file));
                    BufferedOutputStream bufOutput =
                            new BufferedOutputStream
                                    (new FileOutputStream("F:/collection/" + file.getName()))
            ) {
                while (true) {
                    byte[] buffer = new byte[1024];
                    len = bufInput.read(buffer);
                    if (len == -1) {
                        break;
                    }
                    bufOutput.write(buffer);
                    bufOutput.flush();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            File[] listFiles = file.listFiles();
            for (File files : listFiles) {
                /**
                 * Recursion
                 */
                copyFile(files.getPath());
            }

        }

    }

    public static void main(String[] args) {

        testCopy test = new testCopy();
        test.copyFile("F:/folder");


    }
}
