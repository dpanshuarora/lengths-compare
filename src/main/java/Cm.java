class Cm extends LengthUnit implements Unit {

  Cm(double value) {
    super(value);
  }

  public double toInches() {
    return value * CM_INCHES_CF;
  }

  public String toString() {
    return value + "cm";
  }

}