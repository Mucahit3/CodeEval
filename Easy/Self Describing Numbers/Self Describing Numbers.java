import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[] numbersAsChar;
        int[] numbersAsInt;


        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            numbersAsChar = line.toCharArray();
            numbersAsInt = new int[numbersAsChar.length];

            for (int i = 0; i < numbersAsChar.length; i++){
                numbersAsInt[i] = Character.getNumericValue(numbersAsChar[i]);
            }

            System.out.println(isSelfDescribingNumber(numbersAsInt));

        }
    }

    private static int isSelfDescribingNumber(int[] digits){

        int temp;
        int countOneDigit;
        int countFullDigits = 0;


        for(int i = 0; i < digits.length; i++){
            countOneDigit = 0;
            temp = digits[i];
            for (int j = 0; j < digits.length; j++){
                if(i == digits[j])
                    countOneDigit++;
            }
            if(temp == countOneDigit)
                countFullDigits++;
            else
                break;
        }

        if(countFullDigits == digits.length)
            return 1;
        return 0;
    }
}


