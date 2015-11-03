package data_representation;

import java.util.Stack;

public class Bitstring
{
    public static void main(String[] args)
    {
        System.out.println(toBitstring(24));
        System.out.println(countOneBits(8));
        System.out.println(isPalindrome(9));
    }

    /*
        Given an integer, write code to print out its bitstring.
    */

    public static String toBitstring(int x) {
        String bitstring = "";
        Stack<Integer> modulos = new Stack<Integer>();
        while (x >= 0) {
            int modulo = x % 2;
            modulos.push(modulo);
            x = x - (x / 2);
        }
        while(!modulos.isEmpty()) {
            bitstring += modulos.pop();
        }
        return bitstring;
    }

    /*
        Given an integer, write code to count the number of 1s in its bitstring.
    */

    public static int countOneBits(int x) {
        String bitstring = toBitstring(x);
        int countOneBits = 0;
        for (int i = 0; i < bitstring.length(); i++) {
            if (bitstring.charAt(i) == '1') {
                countOneBits++;
            }
        }
        return countOneBits;
    }

    /*
        Given an integer, write code to determine whether its bitstring is a palindrome.
    */

    public static boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        String bitstring = toBitstring(x);
        int middle = bitstring.length() / 2;
        for (int i = 0; i < middle; i ++) {
            for (int j = bitstring.length() - 1; j >= middle; j--) {
                if (bitstring.charAt(i) == bitstring.charAt(j)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                }
            }
        }
        return isPalindrome;
    }
}
