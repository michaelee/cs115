import org.junit.*;
import static org.junit.Assert.*;

public class TestLab5 {
  final static double DELTA = 0.5;
  
  @Test
  public void testBikes() {
    Bicycle b1 = new Bicycle(63360/Math.PI, 1),
            b2 = new Bicycle(30.0, 1.5);
    b1.changeCadence(1);
    b1.pedal(1);
    assertEquals(1, b1.getGear());
    assertEquals(1, b1.getCadence());
    assertEquals(1, b1.getDistance(), DELTA);
    b1.changeCadence(2);
    b1.pedal(2);
    assertEquals(1, b1.getGear());
    assertEquals(2, b1.getCadence());
    assertEquals(5, b1.getDistance(), DELTA);
    
    b2.changeCadence(60);
    b2.gearUp();
    b2.gearUp();
    assertEquals(3, b2.getGear());
    b2.pedal(10);
    assertEquals(4.02, b2.getDistance(), DELTA);
    b2.gearDown();
    b2.pedal(20);
    assertEquals(9.37, b2.getDistance(), DELTA);    
  }
}