import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static final Map<Character, Integer> r_numbers;
    static {
        r_numbers = new HashMap<>();
        r_numbers.put('I', 1);
        r_numbers.put('V', 5);
        r_numbers.put('X', 10);
        r_numbers.put('L', 50);
        r_numbers.put('C', 100);
        r_numbers.put('D', 500);
        r_numbers.put('M', 1000);
    }

    public static int romanToInt(String s) {

        int sum = 0, i;
        for (i = 0; i < s.length() - 1; i++) {
            sum += checkNextNum(s.charAt(i), s.charAt(i + 1));
        }
        sum += r_numbers.get(s.charAt(i));
        return sum;

    }

    public static int checkNextNum(Character currentLetter, Character nexCharacter) {
        if (currentLetter == 'I' && (nexCharacter == 'V' || nexCharacter == 'X'))
            return -1;
        else if (currentLetter == 'X' && (nexCharacter == 'L' || nexCharacter == 'C'))
            return -10;
        else if (currentLetter == 'C' && (nexCharacter == 'D' || nexCharacter == 'M'))
            return -100;
        else
            return r_numbers.get(currentLetter);

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

}
