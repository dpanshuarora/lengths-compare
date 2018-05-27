class Inches extends LengthUnit implements Cloneable {

  Inches(double value) {
    super(value);
  }

  public Inches add(LengthUnit unit) throws CloneNotSupportedException {
    Inches inchesClone = (Inches) clone();
    inchesClone.value += unit.toInches();
    return inchesClone;
  }

  public double toInches() {
    return value;
  }

  public String toString() {
    return value + "in";
  }
  
}