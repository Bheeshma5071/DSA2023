class string_pattern2
{
    public static void main(String s)
    {
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s1);
            for(int k=0;k<=i;k++)
                System.out.print(s.charAt(k)+" ");
            System.out.println();
            s1+="  ";
        }
    }
}