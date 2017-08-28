import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] items;
        String result;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            items = line.split(" ");
            result = "";

            for (int i = 0; i < items.length; i += 2){
                if(items[i].equals("00")){
                    result += convertZerosToOnes(items[i + 1]);
                }
                else {
                    result += items[i + 1];
                }
            }

            System.out.println(parseLong(result));
        }
    }

    private static long parseLong(String s) { return new BigInteger(s, 2).longValue(); }

    private static String convertZerosToOnes(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++)
            result += "1";

        return result;
    }
}


