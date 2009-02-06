import org.junit.*;
import static org.junit.Assert.*;

public class TestLab2 {
  Rectangle rect1, rect2, rect3, rect4;
  
  @Before
  public void setUp() {
    // instantiate a 1x1 square
    rect1 = new Rectangle(1, 1);
    
    // instantiate a 2x5 rectangle and assign it to rect2
    
    // instantiate a 120x250 rectangle and assign it to rect3
    
    // instantiate a 1000x2000 rectangle and assign it to rect4
  }

  @Test
  public void testSquare() {
    // check that rect1 computes its area correctly
    assertEquals(1, rect1.area());
    
    // check that rect1 computes its perimeter correctly
 
  }
  
  @Test
  public void testSmallRectangle() {
    // check that rect2 computes its area/perimeter correctly    
  }
  
  @Test
  public void testBigRectangle() {
    // check that rect3 computes its area/perimeter correctly    
  }
  
  // add another Test method below to test the "Huge" rectangle
}