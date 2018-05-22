import java.util.*;

public abstract class LengthUnit implements Comparable<LengthUnit> {

  protected double value;
  
  LengthUnit(double value) {
  	this.value = value;
  }

  public int compareTo(LengthUnit unit) {
    return Double.compare(this.toInches(), unit.toInches());
  }

  double getValue() {
  	return this.value;
  }

  abstract double toInches();
}