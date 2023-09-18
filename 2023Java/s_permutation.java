class s_permutation
{
    public static void main(String s)
    {
        char c[]=new char[s.length()];
        int j1=0;
        for(int i=0;i<s.length();i++)
        c[i]=s.charAt(i);
        for(int i:c)
        System.out.println(i);
    }
}