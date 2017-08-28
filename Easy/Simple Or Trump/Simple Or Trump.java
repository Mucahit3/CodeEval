import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Character, Integer> cardsValues;

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        String[] twoSide;
        String[] card;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();
            twoSide = line.split("\\|");

            twoSide[0] = twoSide[0].trim();
            twoSide[1] = twoSide[1].trim();

            card = twoSide[0].split(" ");

            cardsValues = new HashMap<>();
            fillCardsValues();

            System.out.println(findWinner(card[0], card[1], twoSide[1]));

        }
    }

    private static String findWinner(String first, String second, String trump) {
        if(first.contains(trump) && second.contains(trump)){
            char[] firstChar = first.toCharArray();
            char[] secondChar = second.toCharArray();
            if(cardsValues.get((Object)firstChar[0]) > cardsValues.get((Object)secondChar[0]))
                return first;
            else if(cardsValues.get((Object)firstChar[0]) < cardsValues.get((Object)secondChar[0]))
                return second;
            else
                return first + second;
        }
        else if(first.contains(trump) && !second.contains(trump))
            return first;
        else if(!first.contains(trump) && second.contains(trump))
            return second;
        else if(!first.contains(trump) && !second.contains(trump)){
            char[] firstChar = first.toCharArray();
            char[] secondChar = second.toCharArray();
            if(cardsValues.get(firstChar[0]) > cardsValues.get(secondChar[0]))
                return first;
            else if(cardsValues.get((Object)firstChar[0]) < cardsValues.get((Object)secondChar[0]))
                return second;
            else
                return first + " " + second;
        }

        return "";
    }

    private static void fillCardsValues() {
        cardsValues.put('A', 13);
        cardsValues.put('K', 12);
        cardsValues.put('Q', 11);
        cardsValues.put('J', 10);
        cardsValues.put('1', 9); // It is actually 10 but i will check only first letter and 1 is enough.
        cardsValues.put('9', 8);
        cardsValues.put('8', 7);
        cardsValues.put('7', 6);
        cardsValues.put('6', 5);
        cardsValues.put('5', 4);
        cardsValues.put('4', 3);
        cardsValues.put('3', 2);
        cardsValues.put('2', 1);
    }
}


