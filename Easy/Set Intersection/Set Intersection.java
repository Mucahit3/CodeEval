import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] parts;
        String[] secondPartNumber;
        String result;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            parts = line.split(";");
            secondPartNumber = parts[1].split(",");
            result = "";

            for (int i = 0; i < secondPartNumber.length; i++){
                if(parts[0].contains(secondPartNumber[i])){
                    result += secondPartNumber[i] + ",";
                }
            }

            if(result != "")
                result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }
    }
}


