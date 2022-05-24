import org.junit.Assert;
import org.junit.Test;


public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int localNumber = super.getLocalNumber();
        Assert.assertTrue("Not Matched",localNumber == 14 );
    }
}
