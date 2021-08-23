package bai_16.bai_tap;


import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src\\bai_16\\bai_tap\\input");
        File outFile = new File("src\\bai_16\\bai_tap\\output");

        if (!inputFile.exists()){
            System.out.println("File not Foud");
        }else {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFile));
                String line = "";
                while ((line = bufferedReader.readLine()) != null){
                    bufferedWriter.write(line + "\n");
                }
                bufferedReader.close();
                bufferedWriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                e.printStackTrace();
            }
        }
    }
}
