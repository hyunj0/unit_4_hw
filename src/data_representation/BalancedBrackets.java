package data_representation;

import java.util.Stack;

public class BalancedBrackets
{
    public static void main(String[] args)
    {
        Stack<Character> brackets = new Stack<Character>();

        String bracket = "{{}[()]}";
        for(int i = 0; i < bracket.length(); i++)
        {
            if(bracket.charAt(i) == '{' || bracket.charAt(i) == '(' || bracket.charAt(i) == '[')
            {
                brackets.push(bracket.charAt(i));
            }
            else if(bracket.charAt(i) == '}')
            {
                char open = brackets.pop();
                if(open != '{')
                {
                    brackets.push(open);
                    break;
                }
            }
            else if(bracket.charAt(i) == ')')
            {
                char open = brackets.pop();
                if(open != '(')
                {
                    brackets.push(open);
                    break;
                }
            }
            else if(bracket.charAt(i) == ']')
            {
                char open = brackets.pop();
                if(open != '[')
                {
                    brackets.push(open);
                }
            }
        }
        if(brackets.isEmpty())
        {
            System.out.println("This is a balanced statement");
        }
        else
        {
            System.out.println("This is not a balanced statement");
        }
    }
}
