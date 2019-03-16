package pers.han.TestIO;

import java.io.*;

public class testSerialize {

    public void serialize(String fileName) {

        serializeObject sObj = new serializeObject(
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

            serializeObject obj = (serializeObject)ObjInput.readObject();

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        testSerialize test = new testSerialize();
        test.serialize("serializedFile.obj");
        test.deSerialize("serializedFile.obj");

    }

}
