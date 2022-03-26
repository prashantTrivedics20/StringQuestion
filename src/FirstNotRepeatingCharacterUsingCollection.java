import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatingCharacterUsingCollection {
    // using map
    // map is used to store the data in the form of the key and value
    public static void main(String[] args) {
        String s="AABCDBE";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <s.length(); i++) {
            // if key is already exist in the map ,put in map by incrementing value by 1
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }

        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entrySet:map.entrySet())
        {
            System.out.println(entrySet);
            if(entrySet.getValue()==1)
            {
                System.out.println(entrySet.getKey());
                break;

            }
            //System.out.println(entrySet);
            }
    }
}
