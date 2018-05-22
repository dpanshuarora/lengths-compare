class Yards extends LengthUnit implements Unit {

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