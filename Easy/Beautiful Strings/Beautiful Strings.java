import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Map<Character, Integer> letters;
    private static String forbiddenItems = "!?.,:)(@#$%^&=[];*_+|-<>{}`\"'~/1234567890\\ ";

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[] sentence;
        int maxBeautiful;
        int alphabetNumber;
        //forbiddenItems = forbiddenItems.replaceAll("")

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            line = line.toLowerCase();
            sentence = line.toCharArray();
            maxBeautiful = 0;
            alphabetNumber = 26;

            letters = new HashMap<Character, Integer>();
            fillTheMap();

            for (char letter : sentence){
                if(!forbiddenItems.contains(String.valueOf(letter)) && letter != '\'')
                    letters.put(letter, letters.get(letter) + 1);
            }

            letters = sortByValue(letters);

            Iterator it = letters.entrySet().iterator();

            while (it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                if((int)pair.getValue() == 0)
                    break;
                maxBeautiful += (int)pair.getValue() * alphabetNumber;
                alphabetNumber--;
            }

            System.out.println(maxBeautiful);

        }
    }

    private static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    private static void fillTheMap() {
        letters.put('a', 0);
        letters.put('b', 0);
        letters.put('c', 0);
        letters.put('d', 0);
        letters.put('e', 0);
        letters.put('f', 0);
        letters.put('g', 0);
        letters.put('h', 0);
        letters.put('i', 0);
        letters.put('j', 0);
        letters.put('k', 0);
        letters.put('l', 0);
        letters.put('m', 0);
        letters.put('n', 0);
        letters.put('o', 0);
        letters.put('p', 0);
        letters.put('q', 0);
        letters.put('r', 0);
        letters.put('s', 0);
        letters.put('t', 0);
        letters.put('u', 0);
        letters.put('v', 0);
        letters.put('w', 0);
        letters.put('x', 0);
        letters.put('y', 0);
        letters.put('z', 0);
    }
}


