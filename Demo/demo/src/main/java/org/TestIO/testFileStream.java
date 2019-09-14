package pers.han.TestIO;

/**
 * Split file and combine file parts
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class testFileStream {

    List<File> subFiles;

    testFileStream() {
        subFiles = new ArrayList<>();
    }

    public void fileSplitCombine(String originFile,int partNum,String partParentPath,String partFile,
                                 String partFormat, String combineFile) {

        int fileNum = 1;
        int len;

        File file = new File(originFile);
        //  Get parent fileList
        File[] files = file.getParentFile().listFiles();
        //  Determine newFile's exist?
        //  put in (ArrayList<>() subFiles): keep ArrayList<>() subFiles empty
        for (File SubFile: files) {
            if (SubFile.getName().contains(partFile) && SubFile.isFile()) {
                System.out.println(SubFile.getName());
                subFiles.add(SubFile);
            }
        }
        /**
         * try-with-resource:
         * AutoCloseable
         */
        try(FileInputStream input = new FileInputStream(file)) {
            //  Determine file not split yet
            if (!(subFiles.size() > 0)) {
                while (true) {
                    byte[] buff = new byte[((int)file.length())/partNum];
                    /**
                     * If read return -1 means reaches end of file
                     */
                    len = input.read(buff);
                    if (len == -1) {
                        break;
                    }

                    /**
                     * try-with-resource:
                     * AutoCloseable
                     */
                    try(FileOutputStream output = new FileOutputStream
                            (partParentPath+partFile + (fileNum++) + "."+partFormat)) {

                        output.write(buff,0,len);
                        /**
                         * If BufferI/OStream close() must flush()
                         */
                        output.flush();
                    }
                }
            } else {

                /**
                 * try-with-resource:
                 * AutoCloseable
                 */
                try(FileOutputStream output = new FileOutputStream(combineFile)) {

                    for (File SubFile: subFiles) {
                        //  Set bytesSize
                        byte[] bytes = new byte[(int) SubFile.length()];
                        //  Creat file of each filePart
                        File filePart = new File(SubFile.getPath());

                        /**
                         * try-with-resource:
                         * AutoCloseable
                         */
                        try(FileInputStream Input = new FileInputStream(filePart)) {
                            Input.read(bytes);
                        }
                        output.write(bytes);

                        /**
                         * If BufferI/OStream close() must flush()
                         */
                        output.flush();
                    }
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        testFileStream test = new testFileStream();
        for (int i = 0;i<2;i++) {
            test.fileSplitCombine("F:/oopxxx.png",5,
                    "F:/", "newFile",
                    "png","F:/NewFile.png");
        }

    }

}

