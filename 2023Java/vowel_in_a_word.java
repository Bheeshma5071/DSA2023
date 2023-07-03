import java.util.*;
class vowel_in_a_word
{
    public static void main(String s)
    {
        String v="AEIOUaeiou";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(v.indexOf(s.charAt(i))>=0)
                c++;
        }
        
        System.out.println("The no. of vowels in the input sentence is -  "+c);
    }
}