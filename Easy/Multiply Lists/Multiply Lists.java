import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] lineStringArray = line.split("\\|");
            String[] firstStringArray = lineStringArray[0].trim().split(" ");
            String[] secondStringArray = lineStringArray[1].trim().split(" ");

            int[] firstIntArray = new int[firstStringArray.length];
            int[] secondIntArray = new int[secondStringArray.length];

            for (int i = 0; i < firstIntArray.length; i++) {
                firstIntArray[i] = Integer.parseInt(firstStringArray[i]);
                secondIntArray[i] = Integer.parseInt(secondStringArray[i]);
                System.out.print(firstIntArray[i] * secondIntArray[i]);
                if(i != firstIntArray.length - 1)
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
