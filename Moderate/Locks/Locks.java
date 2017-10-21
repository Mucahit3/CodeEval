import java.io.*;

public class Main {

    private static int[] door;
    private static int doorNumber;
    private static int iterationNumber;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            String[] items = line.split(" ");

            doorNumber = Integer.parseInt(items[0]);
            iterationNumber = Integer.parseInt(items[1]);

            door = new int[doorNumber];
            changeDoorsLocked(iterationNumber);

            int counterUnlockedDoors = 0;
            for (int i = 0; i < doorNumber; i++) {
                if (door[i] == 0)
                    counterUnlockedDoors++;
            }

            System.out.println(counterUnlockedDoors);

            //break;
        }
    }

    // 0 means open door, 1 means locked door.
    private static void changeDoorsLocked(int iterationNumber) {

        for (int i = 1; i <= iterationNumber; i++) {

            if (i == iterationNumber) {
                if(door[doorNumber - 1] == 0)
                    door[doorNumber - 1] = 1;
                else
                    door[doorNumber - 1] = 0;
            }
            else {
                for (int j = 1; j < doorNumber; j += 2) {
                    door[j] = 1;
                }

                for (int j = 2; j < doorNumber; j += 3) {
                    if(door[j] == 0)
                        door[j] = 1;
                    else
                        door[j] = 0;
                }
            }
        }
    }
}
