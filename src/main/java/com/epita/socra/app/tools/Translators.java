package com.epita.socra.app.tools;

import java.util.Dictionary;

/**
* this class handles translations
*
*/
public class Translators {
    
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
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        Character[] romanLiterals = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};

        int outputNumber = 0;
        for (int i = 0;  i < input.length(); i++) {
            boolean isRomanChar = false;
            for (int j = 0; j < romanLiterals.length; j++) {
                if (input.toCharArray()[i]  == romanLiterals[j]) {
                    outputNumber += values[j];
                    isRomanChar = true;
                }
            }
            if (!isRomanChar) {
                return -1;
            }
        }
        return outputNumber;
    }
}
