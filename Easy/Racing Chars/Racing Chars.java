import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[][] racingTrack = new char[50][12];
        int rowNum = 0;
        int location = 0;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();

            for (int i = 0; i < line.length(); i++) {
                racingTrack[rowNum][i] = line.charAt(i);
            }

            if (rowNum == 0) {
                for (int i = 0; i < line.length(); i++) {
                    if (racingTrack[rowNum][i] == 'C') {
                        racingTrack[rowNum][i] = '|';
                        location = i;
                        break;
                    } else if (racingTrack[rowNum][i] == '_' && !line.contains("C")) {
                        racingTrack[rowNum][i] = '|';
                        location = i;
                    }
                }
            }
            else {
                for (int i = 0; i < line.length(); i++) {
                    if (racingTrack[rowNum][i] == 'C') {
                        if(location > i)
                            racingTrack[rowNum][i] = '/';
                        else if (location < i)
                            racingTrack[rowNum][i] = '\\';
                        else
                            racingTrack[rowNum][i] = '|';
                        location = i;
                        break;
                    } else if (racingTrack[rowNum][i] == '_' && !line.contains("C")) {
                        if(location > i)
                            racingTrack[rowNum][i] = '/';
                        else if (location < i)
                            racingTrack[rowNum][i] = '\\';
                        else
                            racingTrack[rowNum][i] = '|';
                        location = i;
                    }
                }
            }

            rowNum++;
        }

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(racingTrack[i][j]);
            }
            System.out.println();
        }
    }
}

