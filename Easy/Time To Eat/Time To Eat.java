import java.io.*;
import java.util.Arrays;

public class Main {

    private static int[] secondsOfHours;
    private static String[] hoursDigits;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] hours;

        int result;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            hours = line.split(" ");
            secondsOfHours = new int[hours.length];

            for (int i = 0; i < hours.length; i++){
                hoursDigits = hours[i].split(":");

                secondsOfHours[i] = calculateSeconds();
            }

            Arrays.sort(secondsOfHours);

            printFullHour();
            System.out.println();

        }

    }

    private static void printFullHour(){
        int hours, minutes, seconds;

        for (int i = secondsOfHours.length - 1; i >= 0; i--){
            seconds = secondsOfHours[i];
            hours = seconds / 3600;
            seconds %= 3600;
            minutes = seconds / 60;
            seconds %= 60;

            System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
            if(i != 0)
                System.out.print(" ");
        }
    }

    private static int calculateSeconds(){
        int seconds = Integer.parseInt(hoursDigits[0]) * 3600;
        seconds += Integer.parseInt(hoursDigits[1]) * 60;
        seconds += Integer.parseInt(hoursDigits[2]);

        return seconds;
    }
}


