import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] numbers;
        String[] hexNumbers;
        String[] binNumbers;
        int sumHex;
        int sumBin;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            numbers = line.split("\\|");
            numbers[0] = numbers[0].trim();
            numbers[1] = numbers[1].trim();
            hexNumbers = numbers[0].split(" ");
            binNumbers = numbers[1].split(" ");
            sumHex = 0;
            sumBin = 0;

            for(int i = 0; i < hexNumbers.length; i++)
                sumHex += hexToDec(hexNumbers[i]);

            for (int i = 0; i < binNumbers.length; i++)
                sumBin += binToDec(binNumbers[i]);

            if(sumBin >= sumHex)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }

    private static int binToDec(String str){
        int dec = Integer.parseInt(str.trim(), 2);
        return dec;
    }

    private static int hexToDec(String str){
        int dec = Integer.parseInt(str.trim(), 16);
        return dec;
    }
}


