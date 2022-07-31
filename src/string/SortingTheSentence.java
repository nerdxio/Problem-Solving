package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence {

    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
      Map<Integer, String>indexWordMap = new HashMap<>();
      for(String world : s.split(" ")){
          int lastIndex =world.length()-1;
          int index = world.charAt(lastIndex) - '0';
          String actualWord = world.substring(0,lastIndex);
          indexWordMap.put(index,actualWord);
      }
      StringBuilder actualString = new StringBuilder();
      for(Map.Entry<Integer,String> indexWord :indexWordMap.entrySet()){
          actualString.append(indexWord.getValue());
          actualString.append(" ");
      }
      return actualString.toString().trim();
    }
}
