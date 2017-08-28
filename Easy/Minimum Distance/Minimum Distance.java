import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            String[] housesString = line.split(" ");
            int []housesInt = new int[housesString.length - 1];

            for (int i = 1; i < housesString.length; i++){
                housesInt[i - 1] = Integer.parseInt(housesString[i]);
            }

            Arrays.sort(housesInt);
            int min = housesInt[0];
            int max = housesInt[housesInt.length - 1];

            long min_distance = 500000;

            for (int i = min; i <= max; i++) {
                long distance = getDistance(housesInt, i);
                if (distance < min_distance)
                    min_distance = distance;
            }

            System.out.println(min_distance);
        }
    }

    private static long getDistance(int[] addresses, int i) {
        long distance = 0;
        for (int address : addresses)
        distance += Math.abs(address - i);
        return distance;
    }
}


