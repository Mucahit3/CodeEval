import java.io.*;

public class Main {

    private static char[] word;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            word = line.toCharArray();

            for (char letter : word){
                if(isThereOnlyOne(letter)){
                    System.out.println(letter);
                    break;
                }

            }

        }
    }

    private static boolean isThereOnlyOne(char ch) {
        int count = 0;
        for (int i = 0; i < word.length; i++){
            if(word[i] == ch)
                count++;
        }

        if(count == 1)
            return true;
        return false;
    }
}


