package SBK.Events;
//
//public class  {
//
//}

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Solution9 {
    public static void main(String[] args) {
        String str = "This this is is done by Vishal Vishal";
        String[] split = str.split(" ");     
                HashMap<String,Integer> map = new HashMap<String,Integer>();

        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count);
            }
  
            else {
                map.put(split[i], 1);
            }
        }
        
        System.out.println(map);
    }
}