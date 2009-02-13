import org.junit.*;
import static org.junit.Assert.*;

public class TestLab3 {
  final static double DELTA = 0.01;
  SimpleMath sm = new SimpleMath();
  
  @Test
  public void testSumOfSquares() {
    assertEquals(2,     sm.sumOfSquares(1, 1));
    assertEquals(8,     sm.sumOfSquares(2, 2));
    assertEquals(200,   sm.sumOfSquares(10, 10));
    assertEquals(10001, sm.sumOfSquares(100, 1));
  }
  
  @Test
  public void testReciprocal() {
    assertEquals(1,   sm.reciprocal(1), DELTA);
    assertEquals(0.1, sm.reciprocal(10), DELTA);
    assertEquals(0.5, sm.reciprocal(2), DELTA);
  }
  
  @Test
  public void testCelsiusToFahr() {
    assertEquals(0,    sm.celsiusToFahr(32), DELTA);
    assertEquals(100,  sm.celsiusToFahr(212), DELTA);
    assertEquals(-40,  sm.celsiusToFahr(-40), DELTA);
    assertEquals(36.8, sm.celsiusToFahr(98.24), DELTA);
  }
  
  @Test
  public void testFahrToCelsius() {
    assertEquals(212, sm.fahrToCelsius(100), DELTA);
    assertEquals(0,   sm.fahrToCelsius(-17.778), DELTA);
    assertEquals(-40, sm.fahrToCelsius(-40), DELTA);
    assertEquals(23,  sm.fahrToCelsius(-5), DELTA);
  }
  
  @Test
  public void testAverage() {
    assertEquals(30,  sm.average(10, 20, 30, 40, 50), DELTA);
    assertEquals(3.6, sm.average(1, 2, 5, 5, 5), DELTA);
    assertEquals(0,   sm.average(0, 0, 0, 0, 0), DELTA);
  }

  @Test
  public void testVariance() {
    assertEquals(0,    sm.variance(5, 5, 5, 5, 5), DELTA);
    assertEquals(0.7,  sm.variance(3, 3, 4, 4, 5), DELTA);
    assertEquals(16.2, sm.variance(10, 10, 15, 18, 18), DELTA);
  }

  @Test
  public void testDivisibleByNine() {
    assertEquals(true,  sm.divisibleByNine(0));
    assertEquals(true,  sm.divisibleByNine(9));
    assertEquals(true,  sm.divisibleByNine(18));
    assertEquals(true,  sm.divisibleByNine(81));
    assertEquals(false, sm.divisibleByNine(1));
    assertEquals(false, sm.divisibleByNine(19));
  }

  @Test
  public void testDistance() {
    assertEquals(1,     sm.distance(1.0, 0.0, 2.0, 0.0), DELTA);
    assertEquals(90,    sm.distance(100.0, 0.0, 10.0, 0.0), DELTA);
    assertEquals(1.414, sm.distance(1.0, 0.0, 0.0, 1.0), DELTA);
    assertEquals(2.828, sm.distance(2.0, 2.0, 0.0, 0.0), DELTA);
  }

  @Test
  public void testYearsInSeconds() {
    assertEquals(0L, sm.yearsInSeconds(0));
    assertEquals(31536000L, sm.yearsInSeconds(1));
    assertEquals(630720000L, sm.yearsInSeconds(20));
  }

  @Test
  public void testAge() {
    assertEquals(0,  sm.age(1, 1, 2009));
    assertEquals(0,  sm.age(12, 31, 2008));
    assertEquals(30, sm.age(9, 22, 1978));
    assertEquals(20, sm.age(1, 1, 1989));
    assertEquals(19, sm.age(3, 10, 1989));
  }
}