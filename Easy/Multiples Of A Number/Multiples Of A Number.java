import java.io.*;

// Bad Algorithm. I didn't do my best.

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] numbers;
        int first;
        int second;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            numbers = line.split(",");
            first = Integer.parseInt(numbers[0]);
            second = Integer.parseInt(numbers[1]);

            // The 100000 is random number.
            for (int i = 2; i < 100000; i++){
                if(second * i > first){
                    System.out.println(second * i);
                    break;
                }

            }

        }
    }
}


