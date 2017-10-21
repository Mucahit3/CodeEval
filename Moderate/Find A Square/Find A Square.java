import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static class Coordinate {
        private int x = 0;
        private int y = 0;
    }

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        Coordinate[] coordinate = new Coordinate[4];

        for (int i = 0; i < coordinate.length; i++) {
            coordinate[i] = new Coordinate();
        }

        while ((line = buffer.readLine()) != null) {

            line = line.trim();

            int objectIndex = 0;
            // false = x, true = y
            boolean isXorYCounter = false;
            for (int i = 0; i < line.length(); i++) {

                if (Character.getNumericValue(line.charAt(i)) != -1) {
                    if (!isXorYCounter) {
                        coordinate[objectIndex].x = Character.getNumericValue(line.charAt(i));
                        isXorYCounter = true;
                    } else {
                        coordinate[objectIndex].y = Character.getNumericValue(line.charAt(i));
                        isXorYCounter = false;
                    }
                }

                if (line.charAt(i) == ' ')
                    objectIndex++;
            }

            List<Double> edges = new ArrayList<>();

            for (int i = 0; i < coordinate.length; i++) {
                for (int j = i + 1; j < coordinate.length; j++) {
                    edges.add(Math.sqrt(Math.pow(coordinate[i].x - coordinate[j].x, 2) + Math.pow(coordinate[i].y - coordinate[j].y, 2)));
                }
            }

            Collections.sort(edges);
            double firstItem = edges.get(0);
            int counter = 0;
            for (Double item : edges) {
                if (item == firstItem)
                    counter++;
            }

            if (counter == 4)
                System.out.println(true);
            else
                System.out.println(false);
            
        }
    }
}
