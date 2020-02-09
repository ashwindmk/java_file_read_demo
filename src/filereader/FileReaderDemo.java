package filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo {
    public static void main(String[] args) {
        String data = readFile("./src/filereader/data.txt");
        System.out.println(data);
    }

    private static String readFile(String filepath) {
        StringBuilder sb = new StringBuilder("");
        try {
            FileReader fr = new FileReader(filepath);
            int i;
            while ((i=fr.read()) != -1) {
                sb.append((char) i);
                //System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
