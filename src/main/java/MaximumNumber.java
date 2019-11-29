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

    public static Float findFloatMaximum(Float a, Float b, Float c)
    {
        if (a.compareTo(b)>0 && b.compareTo(c)>0)
            return a;
        else if (b.compareTo(a)>0 && b.compareTo(c)>0)
            return b;
        return c;
    }

    public static String findStringMaximum(String a, String b, String c)
    {
        String max=a;
        if (b.compareTo(max)>0)
            max=b;
        if (c.compareTo(max)>0)
            max=c;
        return max;
    }
}
