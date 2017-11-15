/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized.

 Examples:

 // returns "theStealthWarrior"
 toCamelCase("the-stealth-warrior")

 // returns "TheStealthWarrior"
 toCamelCase("The_Stealth_Warrior")
 */

import java.lang.StringBuilder;

class Solution {

    static String toCamelCase(String s) {

        if(s.length()<1){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean noLetter = false;
        sb.append(s.substring(0,1));

        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i, i + 1).matches("\\W|_")) {
                noLetter = true;
            } else {
                if (noLetter) {
                    sb.append(s.substring(i,i+1).toUpperCase());
                    noLetter=false;
                }
                else {
                    sb.append(s.substring(i,i+1).toLowerCase());
                    noLetter=false;
                }
            }
        }
        return sb.toString();
    }
}