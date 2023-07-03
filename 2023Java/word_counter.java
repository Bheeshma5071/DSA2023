class word_counter
{

    public static void main(String s,String s2)
    {
        s=s.trim()+" ";
        int c=0;
        for(;s.length()>1;)
        {
            int x=s.indexOf(' ');
            String s1=s.substring(0,x);
            c+=s1.equals(s2)?1:0;
            s=s.substring(x+1);
        }
        System.out.println(s2+"--------- "+c);
    }
}