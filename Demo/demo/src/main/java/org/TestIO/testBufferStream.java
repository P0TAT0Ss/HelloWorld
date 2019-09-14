package pers.han.TestIO;

import java.io.*;

public class testBufferStream {


    testBufferStream() {

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

        testBufferStream testBufferStream = new testBufferStream();
        testBufferStream.removeAnnotation("F:/File.txt","F:/newFile.txt");

    }

}
