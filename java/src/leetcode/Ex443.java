package leetcode;

public class Ex443 {
    public static void main(String[] args) {
        Ex443 main = new Ex443();



    }

    public int compress(char[] chars) {
        int writeIdx = 0;
        for(int i = 0; i< chars.length; i++){
            int start = i;

            while(i < chars.length-1 && chars[i] == chars[i+1]){
                i++;
            }

            chars[writeIdx] = chars[i];
            writeIdx++;
            if(i-start>0){
                for(Character ch: String.valueOf(i-start+1).toCharArray()){
                    chars[writeIdx] = ch;
                    writeIdx++;
                }
            }
        }

        return writeIdx;
    }

}
