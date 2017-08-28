import java.io.*;

public class Main {

    private static int[] numbersInt;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] twoSide;
        String[] numbersString;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoSide = line.split("\\|");
            numbersString = twoSide[0].split(" ");
            numbersInt = new int[numbersString.length];

            for (int i = 0; i < numbersString.length; i++)
                numbersInt[i] = Integer.parseInt(numbersString[i]);

            sortByNumber(Integer.parseInt(twoSide[1].trim()));

            for(int i = 0; i < numbersInt.length; i++){
                System.out.print(numbersInt[i]);
                if(i < numbersInt.length - 1)
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    private static void sortByNumber(int num){

        int temp;
        int countNum = 0;

        for (int j = 0; j < numbersInt.length - 1; j++){
            if(numbersInt[j] > numbersInt[j + 1]){
                temp = numbersInt[j];
                numbersInt[j] = numbersInt[j + 1];
                numbersInt[j + 1] = temp;
                countNum++;
                j = -1;
            }
            if (countNum == num)
                break;
        }
    }
}


