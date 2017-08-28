import java.io.*;
import java.util.*;

public class Main{

    public static void compress(List<Integer> listNumbers){

        int count = 0;
        int temp = listNumbers.get(0);
        int size = listNumbers.size();
        int i = 0;

        for (Integer item : listNumbers){

            if(temp == item){
                count++;
            }
            else{
                System.out.print(count + " " + temp + " ");
                count = 1;
                temp = item;
            }
            if (i == size - 1){
                System.out.print(count + " " + temp);
            }
            i++;
        }
    }

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] stringNumbers;

        while ((line = buffer.readLine()) != null) {

            List<Integer> listNumbers = new ArrayList<>();
            line = line.trim();
            stringNumbers = line.split(" ");

            for (String number : stringNumbers){
                listNumbers.add(Integer.parseInt(number));
            }
            compress(listNumbers);

            System.out.println();
        }
    }
}

