import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] items;
        String[] operator;
        String firstPart;
        String secondPart;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            items = line.split(" ");

            if(items[1].contains("+"))  operator = items[1].split("\\+");
            else                        operator = items[1].split("-");

            firstPart = items[0].substring(0, operator[0].length());
            secondPart = items[0].substring(operator[0].length(), items[0].length());

            if(items[1].contains("+"))
                System.out.println(Integer.parseInt(firstPart) + Integer.parseInt(secondPart));
            else
                System.out.println(Integer.parseInt(firstPart) - Integer.parseInt(secondPart));

        }
    }
}


