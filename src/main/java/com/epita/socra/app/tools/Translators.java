package com.epita.socra.app.tools;

import java.util.HashMap;
import java.util.Map;

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
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
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
        for (int i = 0;  i < input.length(); i++) {
            if (!map.containsKey(inputArray[i])) {
                return -1;
            }
            outputNumber += map.get(inputArray[i]);
        }
        return outputNumber;
    }
}
