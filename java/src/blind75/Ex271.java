package blind75;

import java.util.ArrayList;
import java.util.List;

public class Ex271 {
    public static void main(){

       String res = encode(List.of("Hello", "World"));
       decode(res);
    }

    static public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

   static  public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        char[] chars =  str.toCharArray();

        int idx = 0;
        while(idx < chars.length){
            // read number
            int num = 0;
            while(idx < chars.length && Character.isDigit(chars[idx])){
                num = 10 * num + chars[idx]-'0';
                idx++;
            }
            idx++;


            res.add(str.substring(idx, idx+num));
            idx = idx + num;
        }

        return res;
    }

}
