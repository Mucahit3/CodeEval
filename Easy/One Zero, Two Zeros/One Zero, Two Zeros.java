import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] twoSide;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoSide = line.split(" ");

            System.out.println(findZeros(twoSide[0], twoSide[1]));
        }
    }

    private static int findZeros(String numberOfZeros, String numbers){

        String[] binNumbers = new String[Integer.parseInt(numbers)];
        int count;
        char[] binNumber;
        int resultCount = 0;

        for (int i = 1; i <= Integer.parseInt(numbers); i++){
            binNumbers[i - 1] = Integer.toBinaryString(i);
        }

        for (int i = 0; i < binNumbers.length; i++){
            count = 0;
            binNumber = binNumbers[i].toCharArray();
            for(int j = 0; j < binNumber.length; j++){
                if(binNumber[j] == '0')
                    count++;
            }
            if(count == Integer.parseInt(numberOfZeros))
                resultCount++;
        }

        return resultCount;
    }
}


