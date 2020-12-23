package bai15_io_text_file.bai_tap;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        File file = new File("src/bai15_io_text_file/bai_tap/text.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File file1 = new File("src/bai15_io_text_file/bai_tap/text1.csv");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                bufferedWriter.write(line + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
