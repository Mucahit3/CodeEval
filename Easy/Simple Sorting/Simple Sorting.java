import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] elements;
        float[] floatNumbers;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            elements = line.split(" ");
            floatNumbers = new float[elements.length];

            for (int i = 0; i < elements.length; i++){
                floatNumbers[i] = Float.parseFloat(elements[i]);
            }

            Arrays.sort(floatNumbers);

            for (int i = 0; i < elements.length; i++){
                System.out.printf("%.3f", floatNumbers[i]);
                if(i < elements.length - 1){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}


