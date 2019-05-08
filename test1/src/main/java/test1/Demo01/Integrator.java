package test1.Demo01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Integrator {
    public static boolean Integration(String folderPath, String newPath) {
        File file = new File(folderPath);
        BufferedInputStream buffer = null;
        if (file.isDirectory()) {
            try {
                File[] list = file.listFiles();
                List<BufferedInputStream> fileStreams = new ArrayList<>();
                for (File f : list) {
                    buffer = new BufferedInputStream(new FileInputStream(f));
                    fileStreams.add(buffer);
                }
                try (BufferedOutputStream outputBuffer = new BufferedOutputStream(new FileOutputStream(newPath))) {
                    for (InputStream input : fileStreams) {
                        byte[] bytes = new byte[140660736];
                        input.read(bytes);
                        outputBuffer.write(bytes);
                        outputBuffer.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return true;
            } catch (NullPointerException e) {
                System.out.println("folder is empty");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (buffer == null) {
                    try {
                        buffer.close();
                    } catch (NullPointerException | IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } else {
            System.out.println("No need to integrate");
            return false;
        }
        return false;
    }
}
