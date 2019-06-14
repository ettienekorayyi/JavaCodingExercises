public class Hello {
    public static void main(String[] args)
    {
        Hello hello = new Hello();
        System.out.println(hello.StairCase(2,9));
    }

    public int StairCase(int n, int m)
    {
        int multiples = 0;
        if(n == 0 || m < n) throw new IllegalArgumentException();

        for(int i = n; i < m; i+=2)
        {
            multiples += i;
        }

        return multiples;
    }
}
