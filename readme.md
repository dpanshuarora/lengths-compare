# Lengths Comparison

This performs comparisons between the following units:
- feet and inches
- feet and yards
- inches and cm

Further, it can add two lengths in inches, and inches and cm using function overloading.

### Prerequisites

Java JDK: (Version 1.8.0 or above)

### Installing

Compile the javac source code

```
javac Length.java
```

Execute java application
```
java Length
```

Create an Inches object and a Cm object and add their values.

```
Inches inch = new Inches(5.0);
Cm cm = new Cm(10.0);

double sum = inch.add(cm);
```

Compare 5 inches and 10 cm

```
System.out.println(inch.compareTo(cm));
```