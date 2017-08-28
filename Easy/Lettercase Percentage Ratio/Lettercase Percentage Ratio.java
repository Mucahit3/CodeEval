import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[] letters;

        float lowerCase;
        float upperCase;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();

            lowerCase = 0f;
            upperCase = 0f;

            letters = line.toCharArray();

            for (int i = 0; i < letters.length; i++){

                if(Character.isUpperCase(letters[i]))
                    upperCase++;
                else
                    lowerCase++;
            }

            float percentage;
            percentage = 100 / (upperCase + lowerCase);
            upperCase *= percentage;
            lowerCase *= percentage;

            System.out.printf("lowercase: %.2f" + " uppercase: %.2f\n", lowerCase, upperCase);
        }
    }
}

