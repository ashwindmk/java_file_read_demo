package readallbytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class ReadAllBytesDemo {
    public static void main(String[] args) {
        String data = readFile("./src/readallbytes/data.txt");
        System.out.println(data);
    }

    private static String readFile(String filepath) {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get(filepath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
