import java.io.*;

public class Main {

    public static char find(char[] array, int pos){
        return array[pos - 1];
    }

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String result;
        String number;
        char[] part0;
        char[] part1;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            line += " ";
            String[] parts = line.split("\\| ", 2);
            part0 = parts[0].toCharArray();
            part1 = parts[1].toCharArray();
            number = "";
            result = "";

            for (int i = 0; i < part1.length; i++){
                if(part1[i] == ' '){
                    result += find(part0, Integer.parseInt(number));
                    number = "";
                }
                else{
                    number += part1[i];
                }
            }

            System.out.println(result);
        }
    }
}
