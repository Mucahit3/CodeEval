import java.io.*;

public class Main {

    private static String[] alphabet =
            {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p" ,"q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            findMissingLetters(line.toLowerCase());
        }
    }

    private static void findMissingLetters(String str){

        String result = "";

        for (int i = 0; i < alphabet.length; i++){
            if(!str.contains(alphabet[i]))
                result += alphabet[i];
        }

        if(result.length() == 0)
            System.out.println("NULL");
        else
            System.out.println(result);
    }
}


