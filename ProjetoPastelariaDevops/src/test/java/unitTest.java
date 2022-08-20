import org.junit.Assert;
import org.junit.Test;

public class unitTest {
    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testHelloWorld(){
        Assert.assertEquals("Hello World", helloWorld.getHelloWorld());
    }
}
