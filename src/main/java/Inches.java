class Inches extends LengthUnit implements Unit, Cloneable {

  Inches(double value) {
    super(value);
  }

  public Inches add(Cm unit) throws CloneNotSupportedException {
    Inches inchesClone = (Inches) clone();
    inchesClone.value += unit.toInches();
    return inchesClone;
  }

  public Inches add(Inches unit) throws CloneNotSupportedException {
    Inches inchesClone = (Inches) clone();
    inchesClone.value += unit.value;
    return inchesClone;
  }

  public double toInches() {
    return value;
  }

  public String toString() {
    return value + "in";
  }
  
}