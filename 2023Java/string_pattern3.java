class string_pattern3
{
    public static void main(String s)
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");
            if(i==0)
            {
                for(int j=1;j<s.length()-1;j++)
                    System.out.print(s.charAt(j)+" ");
            }
            if(i==s.length()-1)
            {
                for(int j=s.length()-2;j>=1;j--)
                    System.out.print(s.charAt(j)+" ");
            }
            for(int j=1;j<s.length()-1 && i!=0 && i!=s.length()-1;j++)
                System.out.print("  ");
            System.out.print(s.charAt(s.length()-(i+1))+" ");

            System.out.println();
        }
    }
}