class Cm extends Unit {

  Cm(double value) {
    super(value);
  }

  double toInches() {
    return value * 2.0/5.0;
  }

  public String toString() {
    return value + "cm";
  }

}