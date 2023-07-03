class closest_vowel
{
    public static void main(String s)
    {
        char a[]={'A','E','I','O','U'};
        char v=a[0];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            v=a[0];
            for(int j=0;j<=3;j++)
            {
                int d=Math.abs((int)(ch)-(int)(a[j]));
                int d1=Math.abs((int)(ch)-(int)(a[j+1]));
                if (d>d1)
                {
                    v=a[j+1];
                    d=d1;
                }
            }
            System.out.println(ch+"---------- "+v);
        }
    }
}