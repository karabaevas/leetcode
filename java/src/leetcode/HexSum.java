package leetcode;

import java.util.HashMap;
import java.util.Map;

public class HexSum {

    static void main() {
        System.out.println(new HexSum().callMethod("FED", "13"));
    }

    public String callMethod(String first, String second){
        Map<Character, Integer> charToInt = new HashMap<>();
        charToInt.put('0', 0);
        charToInt.put('1', 1);
        charToInt.put('2', 2);
        charToInt.put('3', 3);
        charToInt.put('4', 4);
        charToInt.put('5', 5);
        charToInt.put('6', 6);
        charToInt.put('7', 7);
        charToInt.put('8', 8);
        charToInt.put('9', 9);
        charToInt.put('A', 10);
        charToInt.put('B', 11);
        charToInt.put('C', 12);
        charToInt.put('D', 13);
        charToInt.put('E', 14);
        charToInt.put('F', 15);

        Map<Integer, Character> intToChar = new HashMap<>();
        intToChar.put(0, '0');
        intToChar.put(1, '1');
        intToChar.put(2, '2');
        intToChar.put(3, '3');
        intToChar.put(4, '4');
        intToChar.put(5, '5');
        intToChar.put(6, '6');
        intToChar.put(7, '7');
        intToChar.put(8, '8');
        intToChar.put(9, '9');
        intToChar.put(10, 'A');
        intToChar.put(11, 'B');
        intToChar.put(12, 'C');
        intToChar.put(13, 'D');
        intToChar.put(14, 'E');
        intToChar.put(15, 'F');

        return m(charToInt, intToChar, first, second);
    }

    public String m(Map<Character, Integer> charToInt, Map<Integer, Character> intToChar, String first, String second) {
        if(first.length() < second.length()){
            return m(charToInt, intToChar, second, first);
        }

        char carry = '0';
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< first.length(); i++){
            int fidx = first.length() -1 - i;
            char f = first.charAt(fidx);

            int sidx = second.length() -1 - i;
            char s = '0';
            if(sidx >=0){
                s = second.charAt(sidx);
            }

            int sum = charToInt.get(f) + charToInt.get(s) + charToInt.get(carry);
            carry = intToChar.get(sum/16);
            sb.append(intToChar.get(sum%16));
        }
        if(carry != '0'){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }


}
