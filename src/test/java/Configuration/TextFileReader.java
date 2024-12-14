package Configuration;

import java.io.*;

public class TextFileReader {

    public static void main(String[] args) throws IOException {

        reader();
    }

    public static void reader() throws IOException {

        String path = "C:\\Users\\Admin\\Desktop\\TextFile.txt";
        String newFile = "C:\\Users\\Admin\\Desktop\\TextFile2.txt";

        File file = new File(path);
        FileReader reader = new FileReader(file);
        FileWriter writer = new FileWriter(newFile);

        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line;

        while ((line = bufferedReader.readLine()) != null) {

            if(line.length() !=0) {
                bufferedWriter.write(line+"\n");
                //bufferedWriter.newLine();
            }
            System.out.println(line);
        }
        bufferedWriter.close();
    }
}
