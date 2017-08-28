import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            System.out.println(calculateCoinsNumber(Integer.parseInt(line)));
        }
    }
    private static int calculateCoinsNumber(int money){

        int numberOfCoins = 0;

        for (int i = 5; i >= 1; i -= 2){
            if(money >= i){
                numberOfCoins += money / i;
                money %= i;
            }
        }

        return numberOfCoins;
    }
}


