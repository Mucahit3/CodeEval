import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[] sentence;
        char previousChar;
        String result;
        int i;
        int j;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            sentence = line.toCharArray();
            i = 0;
            j = 0;
            result = "";

            while (i < sentence.length){
                j = i;
                result += sentence[i];
                while(i < sentence.length && sentence[j] == sentence[i]){
                    i++;
                }
            }

            System.out.println(result);
        }
    }
}

