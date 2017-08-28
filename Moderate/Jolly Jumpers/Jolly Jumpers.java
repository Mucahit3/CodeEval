import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            if (line.isEmpty()) {
                continue;
            }
            String[] ss = line.split(" ");
            int[] j = new int[ss.length - 2], k = j.clone();

            for (int i = 0; i < ss.length - 2; i++) {
                j[i] = Math.abs(Integer.parseInt(ss[i+1]) - Integer.parseInt(ss[i + 2]));
                k[i] = i + 1;
            }
            Arrays.sort(j);
            System.out.println(Arrays.equals(j, k) ? "Jolly" : "Not jolly");
        }
    }
}
