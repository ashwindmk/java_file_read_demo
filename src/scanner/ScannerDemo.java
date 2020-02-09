package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class ScannerDemo {
    public static void main(String[] args) {
        String data = readFile("./src/scanner/data.txt");
        System.out.println(data);
    }

    private static String readFile(String filepath) {
        StringBuilder sb = new StringBuilder("");
        try {
            File file = new File(filepath);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                sb.append(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
