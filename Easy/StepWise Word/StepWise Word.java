import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String max;
        char[] maxChar;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            max = maxWordOfSentence(line);
            maxChar = max.toCharArray();

            for (int i = 0; i < maxChar.length; i++){
                printStar(i);
                System.out.print(maxChar[i] + " ");
            }

            System.out.println();
        }
    }

    private static void printStar(int num){
        for (int i = 0; i < num; i++)
            System.out.print("*");
    }

    private static String maxWordOfSentence(String str){
        String[] words = str.split(" ");
        String result = "";
        int max = 0;

        for (int i = 0; i < words.length; i++){
            if(words[i].length() > max){
                max = words[i].length();
                result = words[i];
            }
        }

        return result;
    }
}

