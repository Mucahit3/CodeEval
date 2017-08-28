import java.io.*;

public class Main {

    private static String[] hoursDigits;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] hours;
        int first = 0;
        int second = 0;
        int result;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            hours = line.split(" ");

            for (int i = 0; i < 2; i++){
                hoursDigits = hours[i].split(":");

                if(i == 0)
                    first = calculateSeconds();
                else
                    second = calculateSeconds();
            }

            result = first - second;
            if(result < 0) result = Math.abs(result);

            printFullHour(result);

        }
    }

    private static void printFullHour(int seconds){
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    private static int calculateSeconds(){
        int seconds = Integer.parseInt(hoursDigits[0]) * 3600;
        seconds += Integer.parseInt(hoursDigits[1]) * 60;
        seconds += Integer.parseInt(hoursDigits[2]);

        return seconds;
    }
}


