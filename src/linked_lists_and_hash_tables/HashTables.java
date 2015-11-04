package linked_lists_and_hash_tables;
import java.util.HashMap;
import java.util.Map;

public class HashTables
{
    public static void main(String[] args)
    {
        System.out.println(isAnagrams("one", "neo"));
    }

    public static boolean isAnagrams(String one, String two)
    {
        Map<Character, Integer> letterCount = new HashMap<Character, Integer>();

        one = one.toLowerCase();
        two = two.toLowerCase();

        int count = 1;

        for(int i = 0; i < one.length(); i++) {
            if(!letterCount.containsKey(one.charAt(i))) {
                letterCount.put(one.charAt(i), count);
            }
            count = letterCount.get(one.charAt(i)) + 1;
        }
        for (int j = 0; j < two.length(); j++) {
            if(letterCount.containsKey(two.charAt(j))) {
                count = letterCount.get(two.charAt(j)) - 1;
            }
            letterCount.put(two.charAt(j), count);
        }
        System.out.println(letterCount.get('o'));

        if(letterCount.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
