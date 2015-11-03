package linked_lists_and_hash_tables;
import java.util.Map;

public class HashTables
{
    Map<Character, Integer> oneLetterCount;

    public static void main(String[] args)
    {

    }

    public boolean isAnagrams(String one, String two)
    {
        int count = 1;

        for(int i = 0; i < one.length(); i++) {
            if(oneLetterCount.containsKey(one.charAt(i))) {
                count = oneLetterCount.get(one.charAt(i)) + 1;
            }
            oneLetterCount.put(one.charAt(i), count);
        }
        for (int j = 0; j < two.length(); j++) {
            if(oneLetterCount.containsKey(two.charAt(j))) {
                count = oneLetterCount.get(two.charAt(j)) - 1;
            }
            oneLetterCount.put(two.charAt(j), count);
        }

        if(oneLetterCount.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
