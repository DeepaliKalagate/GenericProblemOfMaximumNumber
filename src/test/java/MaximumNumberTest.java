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

}
