package org.TestIO;

import java.io.*;

/**
 * @author OS
 */
public class TestBufferStream {


    TestBufferStream() {

    }

    public void removeAnnotation(String annotatedPath,String removeAnnotationPath) {

        File file = new File(annotatedPath);
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(fileReader);
            PrintWriter writer =
                    new PrintWriter(new BufferedWriter(new FileWriter(removeAnnotationPath)))
            ) {

            while (true) {
                String line = bufReader.readLine();
                if (line == null) {
                    break;
                } else if (line.contains("//")) {
                    continue;
                } else {
                    writer.println(line);
                    writer.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        TestBufferStream testBufferStream = new TestBufferStream();
        testBufferStream.removeAnnotation("F:/File.txt","F:/newFile.txt");

    }

}
