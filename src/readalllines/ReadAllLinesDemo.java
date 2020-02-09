package readalllines;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

class ReadAllLinesDemo {
    public static void main(String[] args) {
        List<String> lines = readFile("./src/readalllines/data.txt");
        StringBuilder sb = new StringBuilder("");
        for (String line : lines) {
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    private static List<String> readFile(String filepath) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(filepath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
