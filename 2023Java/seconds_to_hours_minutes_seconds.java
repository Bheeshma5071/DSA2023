class seconds_to_hours_minutes_seconds
{
    public static void main(int n)
    {
        int y=(int)(n/3600);
        int m=(n%3600)/60;
        int d=(n%3600)%60;
        System.out.println(y+" Hours "+m+" Minutes "+d+" Seconds");
    }
}