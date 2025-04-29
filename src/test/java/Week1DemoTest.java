import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


/**
 * The class containing your tests for the {@link Week1Demo} class.
 * Make sure you test all methods in this class (including both {@link Week1Demo#main(String[])} and {@link Week1Demo#isTriangle(double, double, double)}).
 */
public class Week1DemoTest
{
    @Test
    public void test_is_triangle_1()
    {
        assertTrue(Week1Demo.isTriangle(3,4,5));
    }
  
    @Test
    public void test_is_triangle_2()
    {
        assertTrue(Week1Demo.isTriangle(5,12,13));
    }
  
    @Test
    public void test_is_triangle_3()
    {
        assertTrue(Week1Demo.isTriangle(5,13,12));
    }
  
    @Test
    public void test_is_triangle_4()
    {
        assertTrue(Week1Demo.isTriangle(12,5,13));
    }
  
    @Test
    public void test_is_triangle_5()
    {
        assertTrue(Week1Demo.isTriangle(12,13,5));
    }
  
    @Test
    public void test_is_NOT_triangle_1()
    {
        assertFalse(Week1Demo.isTriangle(5,7,13));
    }
  
    @Test
    public void test_is_NOT_triangle_2()
    {
        assertFalse(Week1Demo.isTriangle(5,13,7));
    }
  
    @Test
    public void test_is_NOT_triangle_3()
    {
        assertFalse(Week1Demo.isTriangle(13,5,7));
    }
  
    @Test
    public void test_is_NOT_triangle_4()
    {
        assertFalse(Week1Demo.isTriangle(13,7,5));
    }
  
    @Test
    public void test_is_NOT_triangle_6()
    {
        assertFalse(Week1Demo.isTriangle(5,9,3));
    }
  
    @Test
    public void test_is_NOT_triangle_7()
    {
        assertFalse(Week1Demo.isTriangle(1,2,-1));
    }
  
    @Test
    public void test_is_NOT_triangle_8()
    {
        assertFalse(Week1Demo.isTriangle(1,-1,2));
    }
  
    @Test
    public void test_is_NOT_triangle_9()
    {
        assertFalse(Week1Demo.isTriangle(-1,2,1));
    }
  
    @Test
    public void test_is_NOT_triangle_10()
    {
        assertFalse(Week1Demo.isTriangle(-1,-1,-1));
    }
  
    @Test
    public void test_is_NOT_triangle_11()
    {
        assertFalse(Week1Demo.isTriangle(1,2,3));
    }
  
    @Test
    public void test_is_NOT_triangle_12()
    {
        assertFalse(Week1Demo.isTriangle(2,1,3));
    }
  
    @Test
    public void test_is_NOT_triangle_13()
    {
        assertFalse(Week1Demo.isTriangle(2,3,1));
    }
  
    @Test
    public void test_is_NOT_triangle_14()
    {
        assertFalse(Week1Demo.isTriangle(3,1,2));
    }

    
}
