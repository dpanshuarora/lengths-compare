class Inches extends LengthUnit implements Unit {

  Inches(double value) {
    super(value);
  }

  public Inches add(Cm unit) {
    value += unit.toInches();
    return this;
  }

  public Inches add(Inches unit) {
    value += unit.value;
    return this;
  }

  public double toInches() {
    return value;
  }

  public String toString() {
    return value + "in";
  }

}