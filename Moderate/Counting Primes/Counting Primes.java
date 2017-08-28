import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] between;
        int count;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            between = line.split(",");
            count = 0;

            for (int i = Integer.parseInt(between[0]); i <= Integer.parseInt(between[1]); i++){
                if(isPrime(i))
                    count++;
            }

            System.out.println(count);
        }
    }

    private static boolean isPrime(int number){
        for (int i = 2; i < number; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}


