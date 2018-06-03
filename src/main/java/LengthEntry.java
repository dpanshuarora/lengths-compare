public class LengthEntry {
    
  public static void main(String[] args) throws CloneNotSupportedException {
    Feet feet = new Feet(15.0);
    Inches inch = new Inches(10.0);
    CentiMeters centiMeters = new CentiMeters(12.0);

    System.out.println(inch + " + " + centiMeters + " = " + inch.add(centiMeters));
    
  }

}