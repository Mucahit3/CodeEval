import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] coordinatesString;
        int[] coordinates;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            coordinatesString = line.split(" ");
            coordinates = new int[coordinatesString.length];

            for (int i = 0; i < coordinatesString.length; i++){
                coordinates[i] = Integer.parseInt(coordinatesString[i]);
            }

            System.out.println(findThePlace(coordinates));

        }
    }

    private static String findThePlace(int[] coordinates) {
        if(coordinates[0] == coordinates[2] && coordinates[1] == coordinates[3])
            return "here";
        else if(coordinates[0] == coordinates[2] && coordinates[1] > coordinates[3])
            return "S";
        else if(coordinates[0] == coordinates[2] && coordinates[1] < coordinates[3])
            return "N";
        else if(coordinates[0] < coordinates[2] && coordinates[1] == coordinates[3])
            return "E";
        else if(coordinates[0] > coordinates[2] && coordinates[1] == coordinates[3])
            return "W";
        else if(coordinates[0] < coordinates[2] && coordinates[1] < coordinates[3])
            return "NE";
        else if(coordinates[0] > coordinates[2] && coordinates[1] < coordinates[3])
            return "NW";
        else if(coordinates[0] < coordinates[2] && coordinates[1] > coordinates[3])
            return "SE";
        else if(coordinates[0] > coordinates[2] && coordinates[1] > coordinates[3])
            return "SW";
        return "";
    }
}


