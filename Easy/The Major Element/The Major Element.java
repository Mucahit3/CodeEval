import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] numbers;
        int[] numbersArray;
        int temp;
        int count;
        int max;
        int result;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            numbers = line.split(",");
            numbersArray = new int[numbers.length];
            count = 0;
            max = 0;
            result = 0;

            for (int i = 0; i < numbersArray.length; i++){
                numbersArray[i] = Integer.parseInt(numbers[i]);
            }

            Arrays.sort(numbersArray);

            for (int i = 0; i < numbersArray.length; i++){
                temp = numbersArray[i];
                while (i < numbersArray.length && numbersArray[i] == temp){
                    i++;
                    count++;
                }
                if(count > max && count > numbersArray.length / 2){
                    max = count;
                    result = temp;
                }
                i--;
                count = 0;
            }

            if(result == 0)
                System.out.println("None");
            else
                System.out.println(result);
        }
    }
}

