public class MaximumNumber
{
    public static  <E extends Object> E findMaximum(E a,E b,E c)
    {
        E max=a;
        if (b.toString().compareTo(max.toString())>0)
            max=b;
        if (c.toString().compareTo(max.toString())>0)
            max=c;

        return max;
    }
}
