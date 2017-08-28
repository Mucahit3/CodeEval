import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] numbersString;
        int[] numbersInteger;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            numbersString = line.split(",");
            numbersInteger = new int[numbersString.length];

            for (int i = 0; i < numbersString.length; i++)
                numbersInteger[i] = Integer.parseInt(numbersString[i]);

            System.out.println(findMaxSumOfContiguousIntegers(numbersInteger));
        }
    }

    private static int findMaxSumOfContiguousIntegers(int[] numbers) {

        int sum;
        int max = 0;

        for (int i = 0; i < numbers.length; i++){
            sum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++){
                sum += numbers[j];
                if(sum > max){
                    max = sum;
                }
            }
        }

        if(max == 0){
            Arrays.sort(numbers);
            max = numbers[numbers.length - 1];
        }


        return max;
    }
}


