import java.util.ArrayList;
import java.util.List;

public class ODEV3 {

        ArrayList<String> combinations;
        String digits;
        int len;
        char[][] dictionary;
        public List<String> harfKombinasyonu(String digits) {
            this.len = digits.length();
            combinations = new ArrayList();
            if(len==0)
                return combinations;
            this.digits = digits;
            dictionary = new char[][]{{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
            addCombinations(0,new char[len]);
            return combinations;
        }
        private void addCombinations(int gosterge, char[] dizi){
            for(char c : dizi){
            }
            if(gosterge == len)
                combinations.add(String.valueOf(dizi));
            else{
                for(char letter : dictionary[digits.charAt(gosterge)-50]){
                    char[] sequenceCopy = new char[len];
                    for(int i =0; i < gosterge; i++){
                        sequenceCopy[i] = dizi[i];
                    }
                    sequenceCopy[gosterge] = letter;
                    addCombinations(gosterge+1, sequenceCopy);
                }

            }
        }
    }

