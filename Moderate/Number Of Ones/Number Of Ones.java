import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            System.out.println(numberOfOnes(Integer.parseInt(line)));

        }
    }

    private static int numberOfOnes(int number) {
        String binaryNumber = Integer.toBinaryString(number);
        char[] digits = binaryNumber.toCharArray();

        int count = 0;

        for (char digit : digits){
            if(digit == '1')
                count++;
        }

        return count;
    }
}


