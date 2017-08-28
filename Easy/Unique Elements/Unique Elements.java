import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String[] numbers;
        int[] numberArray;
        int number;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            numbers = line.split(",");
            numberArray = new int[numbers.length];

            for(int i = 0; i < numbers.length; i++){
                numberArray[i] = Integer.parseInt(numbers[i]);
            }

            for(int i = 0; i < numberArray.length; i++){

                number = numberArray[i];
                while(i < numberArray.length && numberArray[i] == number)
                    i++;
                i--;
                System.out.print(number);
                if(i != numberArray.length - 1)
                    System.out.print(",");
            }

            System.out.println();
        }
    }
}


