/**
 * Create a simple calculator that given a string of operators (+ - * and /) and numbers separated by spaces returns the value of that expression

 Example:

 Calculator.evaluate("2 / 2 + 3 * 4 - 6") // => 7
 Remember about the order of operations! Multiplications and divisions have a higher priority and should be performed left-to-right. Additions and subtractions have a lower priority and should also be performed left-to-right.
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Calculator {
    public static Double evaluate(String expression) {
        List<String> wstep = new ArrayList<>();
        expression=" "+expression;

        for (int i = 0; i < expression.length(); i++) {

            if (wstep.size()>0&&Character.isDigit(expression.charAt(i)) && (Character.isDigit(expression.charAt(i - 1)) || (expression.charAt(i - 1) == '-') && i == 1)) {
                wstep.set(wstep.size() - 1, wstep.get(wstep.size() - 1).concat(expression.substring(i, i + 1)));
            }else if (wstep.size()>0&&Character.isDigit(expression.charAt(i))&&Character.isDigit(wstep.get(wstep.size()-1).charAt(wstep.get(wstep.size()-1).length()-1))) {
                wstep.set(wstep.size() - 1, wstep.get(wstep.size() - 1).concat(expression.substring(i, i + 1)));
            }else if (Character.isDigit(expression.charAt(i))) {
                wstep.add(expression.substring(i, i + 1));
            } else if (expression.charAt(i) == 'E'||expression.charAt(i) == '*' || expression.charAt(i) == '/' || expression.charAt(i) == '+' || expression.charAt(i) == '-'||expression.charAt(i)=='.') {
                wstep.add(expression.substring(i, i + 1));
            }

        }
        if (wstep.size()<1){
            throw new RuntimeException("Nic senownego nie napisano");
        }
        StringBuilder sb = new StringBuilder();
        for (String s : wstep) {
            sb.append(s);
        }
        Pattern pattern = Pattern.compile(".*[+*/-][*+/].*|.*[+*/-]--.*|^[+*/].*|^--.*|.*[+*/-]$");
        if (pattern.matcher(sb.toString()).matches()) {
            throw new RuntimeException ("Nie podano argumentu do liczenia");
        }
        if (wstep.get(0).equals("-")){
            wstep.set(1,"-".concat(wstep.get(1)));
            wstep.remove(0);
        }
        for (int i = 1; i < wstep.size(); i++) {
            if (wstep.get(i).charAt(0) == '-' && Character.isDigit(wstep.get(i + 1).charAt(0))&&!Character.isDigit(wstep.get(i - 1).charAt(wstep.get(i-1).length()-1))) {
                wstep.set(i + 1, "-".concat(wstep.get(i + 1)));
                wstep.remove(i);
            }
        }

        List<String> mnozenie = new ArrayList<>();
        mnozenie.add(wstep.get(0));
        for (int i = 1; i < wstep.size(); i++) {
            if (!wstep.get(i).equals("+") && !wstep.get(i).equals("-") && !wstep.get(i - 1).equals("+") && !wstep.get(i - 1).equals("-")) {
                mnozenie.set(mnozenie.size() - 1, mnozenie.get(mnozenie.size() - 1).concat(wstep.get(i)));
            } else if (wstep.get(i).equals("+") || wstep.get(i).equals("-")) {
                mnozenie.add(wstep.get(i));
            } else if (!wstep.get(i).equals("+") && !wstep.get(i).equals("-") && (wstep.get(i - 1).equals("+") || wstep.get(i - 1).equals("-"))) {
                mnozenie.add(wstep.get(i));
            }
        }
        List<String> pomnozone = new ArrayList<>();
        List<String> mnozniki = new ArrayList<>();
        List<String> multidivide = new ArrayList<>();
        for (int i = 0; i < mnozenie.size(); i++) {
            if (!mnozenie.get(i).contains("*") && !mnozenie.get(i).contains("/")) {
                pomnozone.add(mnozenie.get(i));
            } else {
                mnozniki = Arrays.asList(mnozenie.get(i).split("[\\*\\/]"));
                multidivide = Arrays.asList(mnozenie.get(i).split("[0-9\\.]+"));
                BigDecimal bg = new BigDecimal(mnozniki.get(0));
                for (int j = 1; j < mnozniki.size(); j++) {
                    if (multidivide.get(j).equals("*")||multidivide.get(j).equals("*-")) {
                        bg = bg.multiply(new BigDecimal(mnozniki.get(j)));
                    } else if (multidivide.get(j).equals("/")||multidivide.get(j).equals("/-")) {
                        if (mnozniki.get(j).equals("0"))
                            throw new RuntimeException("Nie dzielimy przez 0");
                        bg = bg.divide(new BigDecimal(mnozniki.get(j)));
                    }
                }
                pomnozone.add(bg.toString());
            }

        }
        BigDecimal bg = new BigDecimal(pomnozone.get(0));
        for (int i = 0; i < pomnozone.size() - 2; i += 2) {
            if (pomnozone.get(i + 1).equals("+")) {
                bg = bg.add(new BigDecimal(pomnozone.get(i + 2)));
            } else {
                bg = bg.subtract(new BigDecimal(pomnozone.get(i + 2)));
            }
        }


        return Double.valueOf(bg.toString());
    }
}