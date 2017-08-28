import java.io.*;

public class Main {

    private static int[] array;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] twoPart;
        String[] arrayNumbers;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoPart = line.split(" \\| ");
            arrayNumbers = twoPart[0].split(" ");
            array = new int[arrayNumbers.length];

            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(arrayNumbers[i]);
            }

            coctailSort(Integer.parseInt(twoPart[1]));

            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }

            System.out.println();
        }
    }

    private static void coctailSort(int cycleNumber){

        int tempForSwap;

        for (int num = 0; num < cycleNumber; num++){
            for(int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]) {
                    tempForSwap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempForSwap;
                }
            }
            for(int j = array.length - 1; j > 0 ; j--){
                if (array[j - 1] > array[j]) {
                    tempForSwap = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tempForSwap;
                }
            }
        }
    }
}

