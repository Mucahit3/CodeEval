import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String result;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            result = "";

            for (int i = 2; (int)(Math.pow(2, i) - 1) < Integer.parseInt(line); i++){
                if(isPrime(i)){
                    result += (int)(Math.pow(2, i) - 1) + ", ";
                }
            }

            result = result.substring(0, result.length() - 2);
            System.out.println(result);
        }
    }

    private static boolean isPrime(int num){

        for(int i = 2; i < num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}


