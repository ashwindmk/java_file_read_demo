package bufferedreader;

import java.io.*;

class BufferedReaderDemo {
    public static void main(String[] args) {
        String data = readFile("./src/bufferedreader/data.txt");
        System.out.println(data);
    }

    private static String readFile(String filepath) {
        StringBuilder sb = new StringBuilder("");
        File file = new File(filepath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
