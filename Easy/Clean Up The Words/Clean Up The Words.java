
import java.io.*;

public class Main {

    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[] charArrayLine;
        String result;
        String[] resultForTrim;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            line = line.toLowerCase();
            charArrayLine = line.toCharArray();
            result = "";

            for (char letter : charArrayLine){
                if(alphabet.contains(String.valueOf(letter))){
                    result += letter;
                }
                else
                    result += " ";
            }

            result = result.trim();
            resultForTrim = result.split(" ");
            result = "";

            for (int i = 0; i < resultForTrim.length; i++){
                if(!resultForTrim[i].equals("")){
                    result += resultForTrim[i];
                    if(i < resultForTrim.length - 1)
                        result += " ";
                }
            }

            System.out.println(result);
        }
    }
}


