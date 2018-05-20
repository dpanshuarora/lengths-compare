abstract class Unit {

  double value;
  
  Unit(double value) {
    this.value = value;
  }

  String compareTo(Unit unit) {
    if(unit.toInches() == this.toInches()) {
      return "Both values are equal";
    }
    else if(unit.toInches() > this.value) {
      return unit + " is greater";
    }
    else {
      return this + " is greater";
    }
  }
  
  abstract double toInches();

  abstract public String toString();
}


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


class Yards extends Unit {

  Yards(double value) {
    super(value);
  }

  double toFeet() {
    return this.value * 3.0;
  }

  double toInches() {
    return this.value * 36.0;
  }

  String compareTo(Feet unit) {
    return unit.compareTo(this);
  }

  public String toString() {
    return this.value + "yds";
  }
}