/**
 * Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.

 Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

 Example:

 conversion.solution(1000); //should return "M"
 Help:

 Symbol    Value
 I          1
 V          5
 X          10
 L          50
 C          100
 D          500
 M          1,000
 Remember that there can't be more than 3 identical symbols in a row.

 More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals
 */

public class Conversion {

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        if (n >= 1000) {
            while (n >= 1000) {
                sb.append('M');
                n -= 1000;
            }
        }
        if (n > 900) {
            sb.append("CM");
            n -= 900;
        }
        if (n > 400 && n < 500) {
            sb.append("CM");
            n -= 400;
        }
        if (n > 500) {
            sb.append('D');
            n -= 500;
        }
        if (n>=100){
            while (n >= 100) {
                sb.append('C');
                n -= 100;
            }
        }
        if (n > 90) {
            sb.append("XC");
            n -= 90;
        }
        if (n > 40 && n < 50) {
            sb.append("XL");
            n -= 40;
        }
        if (n > 50) {
            sb.append('L');
            n -= 50;
        }
        if (n>=10){
            while (n >= 10) {
                sb.append('X');
                n -= 10;
            }
        }
        if (n == 9) {
            sb.append("IX");
            n -= 9;
        }
        if (n ==4) {
            sb.append("IV");
            n -= 4;
        }
        if (n > 5) {
            sb.append('V');
            n -= 5;
        }
        if (n>=1){
            while (n >= 1) {
                sb.append('I');
                n -= 1;
            }
        }
        return sb.toString();
    }
}