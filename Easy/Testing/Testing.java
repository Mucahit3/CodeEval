import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] testLines;
        char[] testing;
        char[] design;
        int count;

        while ((line = buffer.readLine()) != null) {

            testLines = line.split("\\|", 2);
            testLines[0] = testLines[0].substring(0, testLines[0].length() - 1);
            testLines[1] = testLines[1].substring(1, testLines[1].length());
            testing = testLines[0].toCharArray();
            design = testLines[1].toCharArray();
            count = 0;

            for(int i = 0; i < testing.length; i++){
                if(testing[i] != design[i])
                    count++;
            }

            if(count <= 2 && count != 0)
                System.out.println("Low");
            else if(count <= 4 && count != 0)
                System.out.println("Medium");
            else if(count <= 6 && count != 0)
                System.out.println("High");
            else if(count > 6 && count != 0)
                System.out.println("Critical");
            else
                System.out.println("Done");
        }
    }
}


