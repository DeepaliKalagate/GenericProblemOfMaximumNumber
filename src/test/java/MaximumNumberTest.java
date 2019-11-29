import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    @Test
    public void giveThreeNumbers_CheckNumbers_ShouldReturnMaximum()
    {
        Integer maximumNumber=MaximumNumber.findMaximum(10,20,30);
        Assert.assertEquals(Integer.valueOf(30),maximumNumber);
    }

    @Test
    public void giveThreeIntegerNumbers_CheckNumbers_ShouldReturnMaximum()
    {
        Integer maximumNumber=MaximumNumber.findMaximum(30,20,10);
        Assert.assertEquals(Integer.valueOf(30),maximumNumber);
    }

    @Test
    public void giveThreeIntegerNumbers_CheckMaximumNumbers_ShouldReturnMaximum()
    {
        Integer maximumNumber=MaximumNumber.findMaximum(20,30,10);
        Assert.assertEquals(Integer.valueOf(30),maximumNumber);
    }

    @Test
    public void givenThreeFloatNumbers_CheckNumbers_ShouldReturnMaximum()
    {
        Float maximumNumber=MaximumNumber.findMaximum(1.1f,2.2f,3.3f);
        Assert.assertEquals(Float.valueOf(3.3f),maximumNumber);
    }

    @Test
    public void givenThreeString_CheckStrings_ShouldReturnMaximum()
    {
        String maximumString=MaximumNumber.findMaximum("Deepali","Lokesh","Patil");
        Assert.assertEquals("Patil",maximumString);
    }
}
