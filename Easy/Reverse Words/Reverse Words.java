import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] words;

        while ((line = buffer.readLine()) != null && line != " ") {

            line = line.trim();
            words = line.split(" ");

            for (int i = words.length - 1; i >= 0; i--)
                System.out.print(words[i] + " ");

            System.out.println();
        }
    }
}


