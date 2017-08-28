import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] rows;
        int oneRowSize;
        int max;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            rows = line.split(" ");
            oneRowSize = 0;

            for (int i = 0; i < rows.length; i++)       rows[i] = rows[i].trim();

            for (int i = 0; !rows[i].equals("|"); i++)  oneRowSize++;

            for (int i = 0; i < oneRowSize; i++){
                max = -1000;
                for (int j = i; j < rows.length; j += (oneRowSize + 1)){
                    if (Integer.parseInt(rows[j]) > max) {
                        max = Integer.parseInt(rows[j]);
                    }
                }
                System.out.print(max);
                if (i != oneRowSize - 1)
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}


