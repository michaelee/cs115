import org.junit.*;
import static org.junit.Assert.*;

public class TestLab5 {
  final static double DELTA = 0.5;
  
  @Test
  public void testAccessors() {
    Bicycle bike = new Bicycle(29.5, 1.5);
    assertEquals(1, bike.getGear());
    assertEquals(1, bike.getCadence());
    bike.changeCadence(50);
    bike.gearUp();
    bike.gearUp();
    assertEquals(3, bike.getGear());
    assertEquals(50, bike.getCadence());    
    bike.changeCadence(20);
    bike.gearDown();
    assertEquals(2, bike.getGear());
    assertEquals(20, bike.getCadence());    
  }
  
  @Test
  public void testDistance() {
    Bicycle b1 = new Bicycle(63360/Math.PI, 1),
            b2 = new Bicycle(30.0, 1.5);

    b1.changeCadence(1);
    b1.pedal(1);
    assertEquals(1, b1.getDistance(), DELTA);
    b1.changeCadence(2);
    b1.pedal(2);
    assertEquals(5, b1.getDistance(), DELTA);
    
    b2.changeCadence(60);
    b2.gearUp();
    b2.gearUp();
    b2.pedal(10);
    assertEquals(4.02, b2.getDistance(), DELTA);
    b2.gearDown();
    b2.pedal(20);
    assertEquals(9.37, b2.getDistance(), DELTA);    
  }
  
  /* Remove this comment when you're ready to test your default constructor!
  
  @Test
  public void testDefaultConstructor() {
    Bicycle simpleBike = new Bicycle();
    simpleBike.changeCadence(60);
    simpleBike.gearUp();
    simpleBike.pedal(10);
    assertEquals(1.73, simpleBike.getDistance(), DELTA);
  }
  
  */
}