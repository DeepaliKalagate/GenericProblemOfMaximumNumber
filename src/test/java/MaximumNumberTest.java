import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    @Test
    public void giveThreeNumbers_CheckNumbers_ShouldReturnMaximum()
    {
       MaximumNumber maximumNumber=new MaximumNumber();
        Integer maxNumber= (Integer) maximumNumber.findMaximum(10,20,30);
        Assert.assertEquals(Integer.valueOf(30),maxNumber);
    }

    @Test
    public void giveThreeIntegerNumbers_CheckNumbers_ShouldReturnMaximum()
    {
        MaximumNumber maximumNumber=new MaximumNumber();
        Integer maxNumber= (Integer) maximumNumber.findMaximum(30,20,10);
        Assert.assertEquals(Integer.valueOf(30),maxNumber);
    }

    @Test
    public void giveThreeIntegerNumbers_CheckMaximumNumbers_ShouldReturnMaximum()
    {
        MaximumNumber maximumNumber=new MaximumNumber();
        Integer maxNumber= (Integer) maximumNumber.findMaximum(20,30,10);
        Assert.assertEquals(Integer.valueOf(30),maxNumber);
    }

    @Test
    public void givenThreeFloatNumbers_CheckNumbers_ShouldReturnMaximumUsingGeneric()
    {
        MaximumNumber maximumNumber=new MaximumNumber();
        Float maxNumber= (Float) maximumNumber.findMaximum(1.1f,2.2f,3.3f);
        Assert.assertEquals(Float.valueOf(3.3f),maxNumber);
    }

    @Test
    public void givenThreeString_CheckStrings_ShouldReturnMaximumUsingGeneric()
    {
        MaximumNumber maximumNumber=new MaximumNumber();
        String object= (String) maximumNumber.findMaximum("Deepali","Lokesh","Patil");
        Assert.assertEquals("Patil",object);
    }
}
