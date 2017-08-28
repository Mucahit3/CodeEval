import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] items;
        String[] strings;
        String[] numbers;
        String result;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            items = line.split(",");
            result = "";

            for (int i = 0; i < 2; i++){
                for (String item : items){
                    if(!isNumeric(item) && i == 0){
                        result += item + ",";
                        //System.out.print(item + ",");
                    }
                    else if (isNumeric(item) && i == 1){
                        result += item + ",";
                        //System.out.print(item + ",");
                    }
                }
                if(!result.isEmpty())
                    result = result.substring(0, result.length() - 1);
                if(i == 0 && !result.isEmpty())
                    result += "|";
                    // System.out.print("|");
            }

            System.out.println(result);
        }
    }

    private static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}


