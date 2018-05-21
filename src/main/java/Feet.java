class Feet extends Unit {

  Feet(double value) {
    super(value);
  }

  double toInches() {
    return this.value * 12;
  }

  public String toString() {
    return this.value + "ft";
  }

}