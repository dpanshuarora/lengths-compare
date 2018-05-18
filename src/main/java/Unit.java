abstract class Unit {

  double value;
  
  Unit(double value) {
    this.value = value;
  }
}


class Inches extends Unit {

  Inches(double value) {
    super(value);
  }

  double add(Cm unit) {
    return unit.toInches() + this.value;
  }

  double add(Inches unit) {
    return unit.value + this.value;
  }

  double toCm() {
    return this.value * 2.5;
  }
}


class Feet extends Unit {

  Feet(double value) {
    super(value);
  }

  double toInches() {
    return this.value * 12;
  }

  double toYards() {
    return this.value * 1.0/3.0;
  }
}


class Cm extends Unit {

  Cm(double value) {
    super(value);
  }

  double toInches() {
    return this.value * 2.0/5.0;
  }
}