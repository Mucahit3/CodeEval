import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            makeReadMore(line);
        }
    }

    private static void makeReadMore(String line) {
        if(line.length() <= 55) {
            System.out.println(line);
        } else {
            byte i = 39;

            while(i >= 0 && line.charAt(i) != ' ')
                i--;

            i = (i == -1) ? 40 : i;
            System.out.println(line.substring(0, i) + "... <Read More>");
        }
    }
}

