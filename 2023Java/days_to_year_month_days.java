class days_to_year_month_days
{
    public static void main(int n)
    {
        int y=(int)(n/365);
        int m=(n%365)/30;
        int d=(n%365)%30;
        System.out.println(y+" Years "+m+" Months "+d+" Days");
    }
}