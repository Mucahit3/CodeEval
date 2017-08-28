import java.io.*;

public class Main {

    private static String[] players;
    private static String[] twoSides;

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoSides = line.split("\\|");

            for (int i = 0; i < 2; i++) twoSides[i] = twoSides[i].trim();

            players = twoSides[0].split(" ");

            int a = players.length - 1;

            for (int i = 0; i < a; i++){
                findTheWinner();
            }

            System.out.println(players[0]);

        }
    }

    private static void findTheWinner(){
        remove(Integer.parseInt(twoSides[1]));
    }
    // Xabk Uroyx | 3
    private static void remove(int index){
        String[] temp = new String[players.length - 1];
        int j = 0;
        index--;

        if(index >= players.length){
            index %= players.length;
        }

        for (int i = 0; i < players.length; i++){
            if(i != index){
                temp[j] = players[i];
                j++;
            }
        }

        players = new String[temp.length];
        players = temp;
    }
}


