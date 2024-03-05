import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {
    
    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2);
    }
    
    @Test
    public void testSubtraction() {
        assertEquals(2, 4 - 2);
    }
    
    @Test
    public void testMultiplication() {
        assertEquals(8, 4 * 2);
    }
    
    @Test
    public void testDivision() {
        assertEquals(2, 4 / 2);
    }
    
}
