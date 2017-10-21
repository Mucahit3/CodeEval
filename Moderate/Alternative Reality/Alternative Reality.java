import java.io.*;

public class Main {

    private static int[] coins = {50, 25, 10 ,5, 1};
    private static int LASTCOIN = coins[0];

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            int number = Integer.parseInt(line);

            int numberOfReality = numberOfRealities(number, LASTCOIN);

            System.out.println(numberOfReality);
        }
    }

    private static int numberOfRealities(int value, int lastCoin) {
        if (value == 0)
            return 1;

        int counter = 0;

        for (int coin : coins)
            if (coin <= value && coin <= lastCoin)
                counter += numberOfRealities(value - coin, coin);

        return counter;
    }
}
