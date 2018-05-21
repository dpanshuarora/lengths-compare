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