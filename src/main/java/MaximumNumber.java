public class MaximumNumber
{

    public static Integer findMaximum(Integer a,Integer b,Integer c)
    {
        if (a.compareTo(b)>0 && b.compareTo(c)>0)
            return a;
        else if (b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        return c;
    }
}
