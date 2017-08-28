import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] twoPart;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoPart = line.split(",");

            if(twoPart[0].contains(twoPart[1]))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}


