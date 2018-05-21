class Cm extends Unit {

  Cm(double value) {
    super(value);
  }

  double toInches() {
    return this.value * 2.0/5.0;
  }

  public String toString() {
    return this.value + "cm";
  }

}