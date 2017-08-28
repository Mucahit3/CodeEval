import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            String sentance = line.substring(0, line.length() - 2);
            char c = line.charAt(line.length() - 1);
            int index = -1;
            for (int i = 0; i < sentance.length(); i++) {
                if (c == sentance.charAt(i)) {
                    index = i;
                }
            }

            System.out.println(index);
        }
    }
}


