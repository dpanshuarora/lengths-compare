public class LengthEntry {
    
  public static void main(String[] args) {
    Feet feet = new Feet(15.0);
    Inches inch = new Inches(10.0);
    Cm cm = new Cm(12.0);

    System.out.println(inch + " + " + cm + " = " + inch.add(cm));
    
  }

}