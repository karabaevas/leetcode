package blind75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }

        for(int i = 0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j<9; j++){
                char ch = board[j][i];
                if(ch == '.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }

        for(int i = 0; i<9; i=i+3){
            for(int j = 0; j<9; j=j+3){
                Set<Character> set = new HashSet<>();
                for(int k1 = 0; k1<3; k1++){
                    for(int k2 = 0; k2<3; k2++){
                        char ch = board[k1+i][k2+j];
                        if(ch == '.'){
                            continue;
                        }
                        if(set.contains(ch)){
                            return false;
                        }
                        set.add(ch);
                    }
                }
            }
        }

        return true;
    }
}
