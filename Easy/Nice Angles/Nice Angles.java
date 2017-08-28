import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            System.out.println(convertToSexagesimal(line));
        }
    }

    protected static String convertToSexagesimal(String str) {

        double angle = Double.valueOf(str);
        int hour = (int) angle;
        angle = angle % 1;
        angle *= 3600;
        int minute = (int) angle / 60;
        int second = (int) (angle % 60);

        return String.format("%d.%02d'%02d\"", hour, minute, second);
    }

}


