class Inches extends Unit {

  Inches(double value) {
    super(value);
  }

  Inches add(Cm unit) {
    value += unit.toInches();
    return this;
  }

  Inches add(Inches unit) {
    value += unit.value;
    return this;
  }

  double toInches() {
    return value;
  }

  public String toString() {
    return value + "in";
  }

}