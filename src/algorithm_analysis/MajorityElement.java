package algorithm_analysis;

import java.util.HashMap;
import java.util.Map;

/*
    A majority element in an array, A, of size N is an element that appears more than N / 2 times.

    For example,

        3, 3, 4, 2, 4, 4, 2, 4, 4

    has a majority element (4), whereas

        3, 3, 4, 2, 4, 4, 2, 4

    does not.

    Write a program to solve and determine its runtime
*/

public class MajorityElement
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[] {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int[] arr2 = new int[] {3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println(majorityElement(arr1));
        System.out.println(majorityElement(arr2));
    }

    public static String majorityElement(int[] arr)
    {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++)
        {
            int number = arr[i];
            if(!numbers.containsKey(number))
            {
                numbers.put(number, 1);
            }
            else
            {
                numbers.put(number, (numbers.get(number) + 1));
            }
        }

        Map.Entry<Integer, Integer> majority = null;
        for(Map.Entry<Integer, Integer> entry : numbers.entrySet())
        {
            if(majority == null || entry.getValue().compareTo(majority.getValue()) > 0)
            {
                majority = entry;
            }
        }

        String majorityFound = "No majority element found";
        if(majority != null)
        {
            if(majority.getValue() > (arr.length / (double) 2))
            {
                majorityFound = "Majority element " + majority.getKey() + " found";
            }
            else
            {
                majorityFound = "No majority element found";
            }
        }
        return majorityFound;
    }
}
