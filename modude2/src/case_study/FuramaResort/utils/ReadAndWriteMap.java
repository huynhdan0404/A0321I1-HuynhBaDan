package case_study.FuramaResort.utils;

import case_study.FuramaResort.models.Facility;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadAndWriteMap {
    public static void write(Map<Facility,Integer> map, String diaChi){
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
            objectOutputStream.writeObject(map);
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

        Map<Facility,Integer> map = null;
        try {
            filteInputStream = new FileInputStream(diaChi);
            objectInputStream = new ObjectInputStream(filteInputStream);

            map = (Map<Facility,Integer>) objectInputStream.readObject();
            return map;
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
