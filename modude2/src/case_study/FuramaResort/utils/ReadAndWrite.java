package case_study.FuramaResort.utils;


import java.io.*;
import java.util.Collection;

public class ReadAndWrite {
    public static void write(Collection collection, String diaChi){
        File file = new File(diaChi);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
          fileOutputStream = new FileOutputStream(file);
          objectOutputStream = new ObjectOutputStream(fileOutputStream);
          objectOutputStream.writeObject(collection);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Object read(String diaChi) throws IOException {
        FileInputStream filteInputStream = null;
        ObjectInputStream objectInputStream= null;

        Object object = null;
        try {
           filteInputStream = new FileInputStream(diaChi);
           objectInputStream = new ObjectInputStream(filteInputStream);

           object = objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            filteInputStream.close();
            objectInputStream.close();
        }
        return null;
    }
}
