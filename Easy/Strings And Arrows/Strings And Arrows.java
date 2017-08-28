import java.io.*;

public class Main {

    private static String leftArrow = "<--<<";
    private static String rigthArrow = ">>-->";

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String fiveLetter;
        int count;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            count = 0;

            for(int i = 0; i < line.length() && (i + 5) <= line.length(); i++){
                fiveLetter = line.substring(i, i + 5);
                if(fiveLetter.equals(leftArrow)  || fiveLetter.equals(rigthArrow))
                    count++;
            }

            System.out.println(count);
        }
    }
}

