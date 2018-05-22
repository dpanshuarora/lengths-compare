class Feet extends LengthUnit implements Unit {

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