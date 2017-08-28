import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int findMinimumUnique(ArrayList<Integer> array){

        Object[] numbers = array.toArray();
        int count;
        int min = 10;
        int location = -1;

        for (int i = 0; i < array.size(); i++){
            count = 0;
            for (int j = 0; j < array.size(); j++){
                if(numbers[i] == numbers[j]){
                    count++;
                }
            }
            if(count == 1){
                if((int)numbers[i] < min){
                    min = (int)numbers[i];
                    location = i;
                }
            }
        }

        return location + 1;
    }

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[] numbers;

        while ((line = buffer.readLine()) != null) {
            ArrayList<Integer> playerNumber = new ArrayList<Integer>();
            line = line.trim();
            numbers = line.toCharArray();

            for (char letter : numbers){
                if(letter == ' ')
                    continue;
                else{
                    playerNumber.add(Integer.parseInt(String.valueOf(letter)));
                }
            }

            System.out.println(findMinimumUnique(playerNumber));
        }
    }
}
