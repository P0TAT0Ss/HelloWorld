package org.TestIO;

import java.io.*;

/**
 * @author OS
 */
public class TestSerialize {

    public void serialize(String fileName) {

        SerializeObject sObj = new SerializeObject(
                "man","Jue",20,175,75);

        File file = new File(fileName);
        try(
                ObjectOutputStream ObjOutput =
                        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))
        ) {

            ObjOutput.writeObject(sObj);
            ObjOutput.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deSerialize(String fileName) {

        File file = new File(fileName);
        try(
                ObjectInputStream ObjInput =
                        new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))
        ) {

            SerializeObject obj = (SerializeObject)ObjInput.readObject();

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        TestSerialize test = new TestSerialize();
        test.serialize("serializedFile.obj");
        test.deSerialize("serializedFile.obj");

    }

}
