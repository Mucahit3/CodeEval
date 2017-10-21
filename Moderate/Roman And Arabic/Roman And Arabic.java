import java.io.*;
import java.util.HashMap;

public class Main {

    private static HashMap<Character, Integer> RomenNumerals = new HashMap<>();

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        fillRomenNumerals();

        while ((line = buffer.readLine()) != null) {

            line = line.trim();

            int sum = 0;
            for (int i = 0; i < line.length(); i += 2) {
                
                if(i + 3 < line.length() && RomenNumerals.get(line.charAt(i + 1)) < RomenNumerals.get(line.charAt(i + 3)))
                    sum -= Character.getNumericValue(line.charAt(i)) * RomenNumerals.get(line.charAt(i + 1));
                else
                    sum += Character.getNumericValue(line.charAt(i)) * RomenNumerals.get(line.charAt(i + 1));
            }

            System.out.println(sum);
        }
    }

    private static void fillRomenNumerals() {
        RomenNumerals.put('I', 1);
        RomenNumerals.put('V', 5);
        RomenNumerals.put('X', 10);
        RomenNumerals.put('L', 50);
        RomenNumerals.put('C', 100);
        RomenNumerals.put('D', 500);
        RomenNumerals.put('M', 1000);
    }
}
