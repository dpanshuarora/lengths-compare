class Inches extends Unit {

  Inches(double value) {
    super(value);
  }

  Inches add(Cm unit) {
    this.value += unit.toInches();
    return this;
  }

  Inches add(Inches unit) {
    this.value += unit.value;
    return this;
  }

  double toInches() {
    return this.value;
  }

  public String toString() {
    return this.value + "in";
  }

}