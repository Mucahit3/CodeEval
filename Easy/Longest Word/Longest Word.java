import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] words;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            words = line.split(" ");

            System.out.println(maxLengthWord(words));
        }
    }

    private static String maxLengthWord(String[] stringArray){

        int max = 0;
        String maxWord = "";

        for(String word : stringArray){
            if(word.length() > max){
                max = word.length();
                maxWord = word;
            }
        }

        return maxWord;
    }
}


