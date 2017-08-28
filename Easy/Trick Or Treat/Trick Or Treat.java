import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] values;
        int vampires, zombies, witches, houses;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            values = line.split(" ");

            for (int i = 1; i <= 5; i += 2)
                values[i] = values[i].substring(0, values[i].length() - 1);

            vampires = Integer.parseInt(values[1]);
            zombies = Integer.parseInt(values[3]);
            witches = Integer.parseInt(values[5]);
            houses = Integer.parseInt(values[7]);

            System.out.println((((vampires * 3) + (zombies * 4) + (witches * 5)) * houses) / (vampires + zombies + witches));

        }
    }
}


