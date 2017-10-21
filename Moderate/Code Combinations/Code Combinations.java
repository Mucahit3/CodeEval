import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();

            int itemNumber = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '|')
                    itemNumber++;
            }

            String[] values = line.split("\\|");

            for (int i = 0; i < values.length; i++) {
                values[i] = values[i].trim();
            }

            int row = itemNumber + 1;
            int column = values[0].length();
            char[][] matrix = new char[row][column];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = values[i].toCharArray()[j];
                }
            }

            int result = 0;
            String fourItem;
            for (int i = 0; i < row - 1; i++) {
                fourItem = "";
                for (int j = 0; j < column - 1; j++) {
                    fourItem += matrix[i][j];
                    fourItem += matrix[i + 1][j];
                    fourItem += matrix[i][j + 1];
                    fourItem += matrix[i + 1][j + 1];

                    if (fourItem.contains("c") && fourItem.contains("o") && fourItem.contains("d") && fourItem.contains("e"))
                        result++;

                    fourItem = "";
                }
            }


            System.out.println(result);
        }
    }
}
