public class Length {
    
  public static void main(String[] args) {
    Feet feet = new Feet(15.0);
    Inches inch = new Inches(10.0);
    Cm cm = new Cm(12.0);

    System.out.println(feet.value + "ft = " + feet.toInches() + "in");
    System.out.println(feet.value + "ft = " + feet.toYards() + "yds");
    System.out.println(inch.value + "in = " + inch.toCm() + "cm");
    System.out.println(inch.value + "in + " + cm.value + "cm = " + inch.add(cm) + "in");
  }
}