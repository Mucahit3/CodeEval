import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] fourNumbers;
        char[] fourNumber;
        int sum;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            sum = 0;
            fourNumbers = line.split(" ", 4);

            for(int i = 0; i < fourNumbers.length; i++){
                fourNumber = fourNumbers[i].toCharArray();
                for(int j = 0; j < fourNumber.length; j += 2){
                    sum += (Character.getNumericValue(fourNumber[j]) * 2) + Character.getNumericValue(fourNumber[j + 1]);
                }
            }

            if(sum % 10 == 0)
                System.out.println("Real");
            else
                System.out.println("Fake");

        }
    }
}

