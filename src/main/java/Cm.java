class Cm extends LengthUnit implements Unit {

  final double CM_INCHES_CF = 2.0/5.0;

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