import java.io.*;

public class Main{

    public static boolean bitPosition(int number, int pos1, int pos2){

        String binaryString = Integer.toBinaryString(number);
        char[] binaryChar = binaryString.toCharArray();
        char[] temp = new char[binaryChar.length];
        int i = binaryChar.length - 1;

        for (char letter : binaryChar){
            temp[i] = letter;
            i--;
        }

        if(temp[pos1 - 1] == temp[pos2 - 1])
            return true;
        return false;
    }

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] parts;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            parts = line.split(",", 3);

            System.out.println(bitPosition(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
        }
    }
}
