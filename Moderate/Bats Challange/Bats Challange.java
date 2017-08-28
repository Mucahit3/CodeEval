import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    private static ArrayList<Integer> number;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] part;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            part = line.split(" ");

            number = new ArrayList<>();

            number.add(5);
            number.add(Integer.parseInt(part[0]) - 5);

            for (int i = 3; i < 3 + Integer.parseInt(part[2]); i++)
                number.add(Integer.parseInt(part[i]));

            Collections.sort(number);
            Collections.reverse(number);

            Object[] array = number.toArray();
            int additionalBatsNumber = 0;

            for (int i = 0; i < array.length - 1; i++) {
                additionalBatsNumber += ((int) array[i] - (int) array[i + 1] - 2) / Integer.parseInt(part[1]);
            }

            if(part[2].equals("0"))
                System.out.println(additionalBatsNumber + 1);
            else
                System.out.println(additionalBatsNumber);
        }
    }
}

