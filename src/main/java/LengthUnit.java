import java.util.*;

public abstract class LengthUnit implements Comparable<LengthUnit> {

  protected double value;
  
  final static double YARDS_INCHES_CF = 36.0;
  final static double FEET_INCHES_CF = 12.0;
  final static double CM_INCHES_CF = 2.0/5.0;

  LengthUnit(double value) {
  	this.value = value;
  }

  public int compareTo(LengthUnit unit) {
    return Double.compare(this.toInches(), unit.toInches());
  }

  abstract double toInches();
}