import java.io.*;
import java.util.HashMap;

public class Main {

    private static HashMap<Character, Character> alphabet = new HashMap<>();

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        fillAlphabet();

        while ((line = buffer.readLine()) != null) {

            line = line.trim();

            String result = "";
            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == ' ')
                    result += ' ';
                else
                    result += alphabet.get(line.charAt(i));
            }

            System.out.println(result);
        }
    }

    private static void fillAlphabet() {
        alphabet.put('a', 'y');
        alphabet.put('b', 'h');
        alphabet.put('c', 'e');
        alphabet.put('d', 's');
        alphabet.put('e', 'o');
        alphabet.put('f', 'c');
        alphabet.put('g', 'v');
        alphabet.put('h', 'x');
        alphabet.put('i', 'd');
        alphabet.put('j', 'u');
        alphabet.put('k', 'i');
        alphabet.put('l', 'g');
        alphabet.put('m', 'l');
        alphabet.put('n', 'b');
        alphabet.put('o', 'k');
        alphabet.put('p', 'r');
        alphabet.put('q', 'z');
        alphabet.put('r', 't');
        alphabet.put('s', 'n');
        alphabet.put('t', 'w');
        alphabet.put('u', 'j');
        alphabet.put('v', 'p');
        alphabet.put('w', 'f');
        alphabet.put('x', 'm');
        alphabet.put('y', 'a');
        alphabet.put('z', 'q');
    }
}
