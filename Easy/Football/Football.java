import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] countries;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            countries = line.split("\\|");

            int countryIndex = 1;
            Map<String, List<Integer>> teamsPerCountry = new HashMap<>();

            for (String counry : countries) {
                String[] teams = counry.trim().split(" ");
                for (String team : teams) {
                    if(!teamsPerCountry.containsKey(team)) {
                        teamsPerCountry.put(team, new ArrayList<>());
                    }
                    teamsPerCountry.get(team).add(countryIndex);
                }
                countryIndex++;
            }

            StringBuilder builder = new StringBuilder();

            List<String> availableTeams = teamsPerCountry
                    .keySet()
                    .stream()
                    .mapToInt(x -> Integer.parseInt(x))
                    .sorted()
                    .mapToObj(x -> String.valueOf(x))
                    .collect(Collectors.toList());

            for (String team : availableTeams)
            {
                builder.append(team)
                        .append(":")
                        .append(teamsPerCountry
                                .get(team)
                                .stream()
                                .sorted()
                                .map(x -> x.toString())
                                .collect(Collectors.joining(",")))
                        .append("; ");
            }

            if (builder.length() > 0)
            {
                builder.deleteCharAt(builder.length() - 1);
            }

            System.out.println(builder);
        }
    }
}
