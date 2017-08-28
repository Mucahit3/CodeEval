import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] twoSide;
        String[] words;
        char[] letters;
        String result;
        String temp;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoSide = line.split("\\|");

            twoSide[0] = twoSide[0].trim();
            twoSide[1] = twoSide[1].trim();

            words = twoSide[0].split(" ");
            letters = twoSide[1].toCharArray();

            int count;
            result = "";

            for (int j = 0; j < words.length; j++){
                count = 0;
                temp = words[j];
                for (int i = 0; i < letters.length; i++){
                    if(temp.contains(String.valueOf(letters[i]))){
                        count++;
                        temp = remove(temp, letters[i]);
                    }

                }
                if(count == letters.length)
                    result += words[j] + " ";
            }

            if(!result.equals("")) {
                result = result.substring(0, result.length() - 1);
                System.out.println(result);
            }
            else
                System.out.println("False");
        }
    }

    private static String remove(String str, char ch){
        char[] temp = str.toCharArray();

        for (int i = 0; i < temp.length; i++){
            if(ch == temp[i]){
                temp[i] = '!';
                break;
            }
        }

        String result = "";

        for (int i = 0; i < temp.length; i++)
            result += temp[i];

        return result;
    }
}


