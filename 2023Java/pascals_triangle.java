class pascals_triangle
{
    public static void main(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) 
            {
                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++) 
            {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
}
