class Yards extends LengthUnit {

  final static double YARDS_INCHES_CF = 36.0;

  Yards(double value) {
    super(value);
  }

  public double toInches() {
    return value * YARDS_INCHES_CF;
  }

  public String toString() {
    return value + "yds";
  }

}