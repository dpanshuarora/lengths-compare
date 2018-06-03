import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LengthTest {
  private Feet feet;
  private Inches inches;
  private Yards yards;
  private CentiMeters centiMeters;

  @Test
  public void compareFeetAndInches() {
    feet = new Feet(0.5);
    inches = new Inches(2.0);
    assertEquals(1, feet.compareTo(inches));
  }

  @Test
  public void compareCentiMetersAndInches() {
    centiMeters = new CentiMeters(10.0);
    inches = new Inches(2.0);
    assertEquals(1, centiMeters.compareTo(inches));
  }

  @Test
  public void compareYardsAndInches() {
    yards = new Yards(1.0);
    inches = new Inches(35.0);
    assertEquals(1, yards.compareTo(inches));
  }

  @Test
  public void compareInchesAndFeet() {
    inches = new Inches(5.0);
    feet = new Feet(10.0);
    assertEquals(-1, inches.compareTo(feet));
  }

  @Test
  public void compareCentiMetersAndFeet() {
    centiMeters = new CentiMeters(62.0);
    feet = new Feet(2);
    assertEquals(1, centiMeters.compareTo(feet));
  }

  @Test
  public void compareYardsAndFeet() {
    yards = new Yards(5.0);
    feet = new Feet(15.0);
    assertEquals(0, yards.compareTo(feet));
  }

  @Test
  public void compareInchesAndYards() {
    inches = new Inches(5.0);
    yards = new Yards(10.0);
    assertEquals(-1, inches.compareTo(yards));
  }

  @Test
  public void compareCentiMetersAndYards() {
    centiMeters = new CentiMeters(457.0);
    yards = new Yards(10.0);
    assertEquals(-1, centiMeters.compareTo(yards));
  }

  @Test
  public void compareFeetAndYards() {
    feet = new Feet(15.0);
    yards = new Yards(5.0);
    assertEquals(0, feet.compareTo(yards));
  }

  @Test
  public void compareInchesAndCentiMeters() {
    inches = new Inches(10.0);
    centiMeters = new CentiMeters(20.0);
    assertEquals(1, inches.compareTo(centiMeters));
  }

  @Test
  public void compareFeetAndCentiMeters() {
    feet = new Feet(4.0);
    centiMeters = new CentiMeters(40.0);
    assertEquals(1, feet.compareTo(centiMeters));
  }

  @Test
  public void compareYardsAndCentiMeters() {
    yards = new Yards(5);
    centiMeters = new CentiMeters(100);
    assertEquals(1, yards.compareTo(centiMeters));
  }
}