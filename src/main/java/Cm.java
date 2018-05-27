class CentiMeter extends LengthUnit {

  final static double CENTIMETERS_INCHES_CF = 2.0/5.0;

  CentiMeter(double value) {
    super(value);
  }

  public double toInches() {
    return value * CENTIMETERS_INCHES_CF;
  }

  public String toString() {
    return value + "cm";
  }

}