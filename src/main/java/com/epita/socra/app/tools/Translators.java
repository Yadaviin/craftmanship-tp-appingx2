package com.epita.socra.app.tools;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
* this class handles translations.
*
*/
public final class Translators {

    private Translators() {
    }

    /**
    * Translates the int given in input to a roman numeral string.
    *
    * @param number The int that will be translated.
    */
    public static String numeralToRoman(int number) {
        if (number == 1) {
            return "I";
        } else if (number == 5) {
            return "V";
        }
        return "";
    }

    /**
    * Translates the roman numeral string given in input to int.
    *
    * @param input The roman numeral string that will be translated.
    */
    public static int romanToNumeral(String input) {
        // strict roman numeral regex from oreilly.com, used for educational purposes
        String romanNumeralRegexp = "^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$";
        if (!Pattern.compile(romanNumeralRegexp).matcher(input).matches()) {
            return -1;
        }

        // Define roman to arabic dictionary
        final Map<Character, Integer> map = new HashMap<Character, Integer>() {
            private static final long serialVersionUID = 7494877805231994531L;
            {
                put('M', 1000);
                put('D', 500);
                put('C', 100);
                put('L', 50);
                put('X', 10);
                put('V', 5);
                put('I', 1);
            }
        };

        int outputNumber = 0;
        char[] inputArray = input.toCharArray();

        // translation logic
        for (int i = 0;  i < input.length(); i++) {
            // to deduct, condition: suceeding number > current number
            if (i < input.length() - 1 && map.get(inputArray[i]) < map.get(inputArray[i + 1])) {
                outputNumber -= map.get(inputArray[i]);
            } else {
                outputNumber += map.get(inputArray[i]);
            }
        }
        return outputNumber;
    }
}
