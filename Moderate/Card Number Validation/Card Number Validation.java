import java.io.*;

public class Main {

    private static int[] cardDigit;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[] digit;
        int spaceCount;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            digit = line.toCharArray();
            spaceCount = 0;

            for (char item : digit){
                if(item == ' ')
                    spaceCount++;
            }
            cardDigit = new int[digit.length - spaceCount];

            int j = 0;
            for (int i = digit.length - 1; i >= 0; i--) {
                if(digit[i] != ' ') {
                    cardDigit[j] = Character.getNumericValue(digit[i]);
                    j++;
                }
            }

            int sum = 0;
            int doubleDigit;

            for (int i = 0; i < cardDigit.length; i++) {
                if(i % 2 == 1) {
                    doubleDigit = cardDigit[i] * 2;
                    if(doubleDigit > 9) {
                        sum += doubleDigit / 10 + doubleDigit % 10;
                    } else {
                        sum += doubleDigit;
                    }
                } else {
                    sum += cardDigit[i];
                }
            }

            if(sum % 10 == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}

