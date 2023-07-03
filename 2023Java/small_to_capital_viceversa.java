class small_to_capital_viceversa
{
    public static void main(String s)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                s1=s1+Character.toLowerCase(s.charAt(i));

            else if(Character.isLowerCase(s.charAt(i)))
                s1=s1+Character.toUpperCase(s.charAt(i));

            else
                s1=s1+s.charAt(i);
        }

        System.out.println(s1);
    }
}