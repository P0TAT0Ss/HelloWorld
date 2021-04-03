package org.TestIO;
/**
 * Traverse files include subFolder files
 * Sort all files by size
 * Get extreme
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author OS
 */
public class TestFile {

    File file;
    File[] files;
    List<File> isFiles;
    long Max;
    long Min;
    String maxName;
    String minName;

    TestFile() {

        Max = 0;
        Min = Integer.MAX_VALUE;
        isFiles = new ArrayList<>();
    }

    /**
     * Traverse files include subFiles(Recursion) and get size
     */
    public void traverseFiles(String folderName) {

        try {

            /**
             * Determine isFile or isFolder
             * Add file to ArrayList isFiles
             * If not file, use recursion until put all subFolder files to ArrayList isFiles
             */
            file = new File(folderName);
            files = file.listFiles();

            for (File fFile: files) {
                //  Determine file or folder
                if (files != null&&files.length != 0) {
                    if (fFile.isDirectory()) {
                        //  Recursion
                        System.out.println("\nFolder name:\n\t"+fFile.getName()+"\n");
                        traverseFiles(fFile.getAbsolutePath());
                    }
                    //  Add file to ArrayList isFiles
                    else {
                        isFiles.add(fFile);
                        System.out.println(fFile.getName()+"\tsize:\t"+fFile.length());
                    }
                }
                //  Determine folder empty or not
                else {
                    System.out.println("Empty folder\n");
                    return;
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get extreme and get name and size
     */
    public void getExtreme() {
        for (File files: isFiles) {
            if (files.length()>Max) {
                Max = files.length();
                maxName = files.getName();
            } else if (files.length()<Min) {
                Min = files.length();
                minName = files.getName();
            }
        }
        System.out.println("\nMax file name: "+maxName+"\nMax file size: "+Max+
                "\n\nMin file name: "+minName+"\nMin file size: "+Min);
    }

    /**
     * Sort (ArrayList isFiles) files by bubble sort
     */
    public void sortFile() {

        for (int i = 0;i<isFiles.size();i++) {
            for(int j = i+1;j<isFiles.size();j++) {
                if (isFiles.get(i).length() < isFiles.get(j).length()) {
                    File newFile = isFiles.get(i);
                    isFiles.set(i,isFiles.get(j));
                    isFiles.set((j),newFile);
                }
            }
        }

        for (File files: isFiles) {
            System.out.println(files.getName()+"\t"+files.length());
        }
    }

    public static void main(String[] args) {

        TestFile test = new TestFile();

        test.traverseFiles("F:/WYYYY/CloudMusic");
        test.sortFile();
        test.getExtreme();

    }

}
