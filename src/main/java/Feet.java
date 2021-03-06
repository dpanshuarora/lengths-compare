class Feet extends LengthUnit {

  final static double FEET_INCHES_CF = 12.0;

  Feet(double value) {
    super(value);
  }

  public double toInches() {
    return value * FEET_INCHES_CF;
  }

  public String toString() {
    return value + "ft";
  }

}