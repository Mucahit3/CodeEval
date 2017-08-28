import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] twoSide;
        String[] gainsLosses;
        int[] gainsLossesAsInt;
        int day;
        int max;
        int sum;


        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoSide = line.split(";");
            gainsLosses = twoSide[1].split(" ");
            gainsLossesAsInt = new int[gainsLosses.length];
            max = 0;

            day = Integer.parseInt(twoSide[0]);

            for (int i = 0; i < gainsLosses.length; i++){
                gainsLossesAsInt[i] = Integer.parseInt(gainsLosses[i]);
            }

            for(int i = 0; (i + day) <= gainsLossesAsInt.length; i++){
                sum = 0;
                for (int j = i; j < day + i; j++){
                    if(j < gainsLossesAsInt.length)
                        sum += gainsLossesAsInt[j];
                }
                if(sum > max){
                    max = sum;
                }
            }

            System.out.println(max);

        }
    }
}


