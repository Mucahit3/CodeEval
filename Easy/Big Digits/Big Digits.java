import java.io.*;
import java.util.*;

public class Main {

    private static final int DIGIT_HEIGTH = 6;
    private static final int DIGIT_WIDTH = 5;
    private static final int DIGIT_LINE_SIZE = 50;
    private static String DIGITS =
                    "-**----*--***--***---*---****--**--****--**---**--" +
                    "*--*--**-----*----*-*--*-*----*-------*-*--*-*--*-" +
                    "*--*---*---**---**--****-***--***----*---**---***-" +
                    "*--*---*--*-------*----*----*-*--*--*---*--*----*-" +
                    "-**---***-****-***-----*-***---**---*----**---**--" +
                    "--------------------------------------------------";

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));

        String line;
        char[] numbers;

        while ((line = buffer.readLine()) != null) {

            line = line.trim();

            getShapeOfNumber(line);
        }
    }

    private static void getShapeOfNumber(String str) {
        String digits = str.replaceAll("[^\\d]", "");

        for (int line = 0; line < DIGIT_HEIGTH; line++) {
            for (int digitIndex = 0; digitIndex < digits.length(); digitIndex++) {

                int digitValue = Integer.valueOf(digits.substring(digitIndex, digitIndex + 1));
                int beginIndex = digitValue * DIGIT_WIDTH + line * DIGIT_LINE_SIZE;

                System.out.print(DIGITS.substring(beginIndex, beginIndex + DIGIT_WIDTH));
            }

            System.out.println();
        }
    }
}

