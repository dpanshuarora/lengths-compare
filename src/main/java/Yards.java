class Yards extends Unit {

  Yards(double value) {
    super(value);
  }

  double toInches() {
    return value * 36.0;
  }

  public String toString() {
    return value + "yds";
  }
}