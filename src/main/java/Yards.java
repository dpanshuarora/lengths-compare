class Yards extends Unit {

  Yards(double value) {
    super(value);
  }

  double toInches() {
    return this.value * 36.0;
  }

  public String toString() {
    return this.value + "yds";
  }
}