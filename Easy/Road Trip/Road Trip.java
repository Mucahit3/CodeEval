import java.io.*;
import java.util.*;

public class Main {

    private static HashMap<Integer, Integer> routeTable = new HashMap<>();
    private static HashMap<Integer, Integer> sortedRouteTable = new HashMap<>();

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;

        while ((line = buffer.readLine()) != null) {

            clearTable();

            line = line.trim();
            line += " ";

            String[] fullCityDistance = line.split("; ");
            String[] cities = new String[2];

            for (int i = 0; i < fullCityDistance.length; i++) {

                cities = fullCityDistance[i].split(",");
                addToTable(i, Integer.parseInt(cities[1]));
            }

            sortedRouteTable = sortByValues(routeTable);

            for (int i = 0; i < sortedRouteTable.size(); i++) {
                if(i == 0)
                    System.out.print(sortedRouteTable.get(i) + ",");
                else{
                    System.out.print(sortedRouteTable.get(i) - sortedRouteTable.get(i - 1));
                    if(i != sortedRouteTable.size() - 1){
                        System.out.print(",");
                    }
                }
            }

            System.out.println();
        }
    }

    private static void addToTable(Integer key, Integer value) {
        routeTable.put(key, value);
    }

    private static void clearTable() {
        routeTable.clear();
    }

    private static HashMap sortByValues(HashMap map) {

        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        int i = 0;
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(i, entry.getValue());
            i++;
        }
        return sortedHashMap;
    }
}

