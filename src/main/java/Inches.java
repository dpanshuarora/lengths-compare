class Inches extends LengthUnit implements Unit {

  Inches(double value) {
    super(value);
  }

  public String add(Cm unit) {
    value += unit.toInches();
    return this.toString();
  }

  public String add(Inches unit) {
    value += unit.value;
    return this.toString();
  }

  public double toInches() {
    return value;
  }

  public String toString() {
    return value + "in";
  }

}