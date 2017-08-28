import java.io.*;

public class Main {

    private static int SIZE = 256;
    private static int[][] board = new int[SIZE][SIZE];

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] treeItems;
        int sum = 0;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            treeItems = line.split(" ");

            switch (treeItems[0]){
                case "SetCol":{
                    for (int i = 0; i < SIZE; i++){
                        board[i][Integer.parseInt(treeItems[1])] = Integer.parseInt(treeItems[2]);
                    }
                    break;
                }
                case "SetRow":{
                    for (int i = 0; i < SIZE; i++){
                        board[Integer.parseInt(treeItems[1])][i] = Integer.parseInt(treeItems[2]);
                    }
                    break;
                }
                case "QueryCol":{
                    for (int i = 0; i < SIZE; i++)
                        sum += board[i][Integer.parseInt(treeItems[1])];

                    System.out.println(sum);
                    sum = 0;
                    break;
                }
                case "QueryRow":{
                    for (int i = 0; i < SIZE; i++)
                        sum += board[Integer.parseInt(treeItems[1])][i];

                    System.out.println(sum);
                    sum = 0;
                    break;
                }
            }

        }
    }
}


