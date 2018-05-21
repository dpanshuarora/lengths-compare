class Feet extends Unit {

  Feet(double value) {
    super(value);
  }

  double toInches() {
    return value * 12;
  }

  public String toString() {
    return value + "ft";
  }

}