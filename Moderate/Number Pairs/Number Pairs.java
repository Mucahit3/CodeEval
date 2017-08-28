import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] twoPart;
        String[] numbersString;
        int[] numbersInteger;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoPart = line.split(";");

            numbersString = twoPart[0].split(",");
            numbersInteger = new int[numbersString.length];

            for (int i = 0; i < numbersString.length; i++)
                numbersInteger[i] = Integer.parseInt(numbersString[i]);

            int sum;
            String result = "";

            for (int i = 0; i < numbersInteger.length; i++){
                sum = numbersInteger[i];
                for (int j = i + 1; j < numbersInteger.length; j++){
                    if(sum == numbersInteger[j])
                        continue;
                    sum += numbersInteger[j];
                    if(sum == Integer.parseInt(twoPart[1])){
                        result += numbersInteger[i] + "," + numbersInteger[j] + ";";
                    }
                    sum = numbersInteger[i];
                }
            }

            if(!result.equals("")){
                result = result.substring(0, result.length() - 1);
                System.out.println(result);
            }
            else
                System.out.println("NULL");
        }
    }
}


