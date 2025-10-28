class AreaCalculator {

 // Method to find area of a circle

 double area(double radius) {

 return 3.1416 * radius * radius;

 }

 // Method to find area of a rectangle

 double area(double length, double breadth) {

 return length * breadth;

 }
// Method to find area of a triangle

 double area(double base, double height, boolean isTriangle) {

 return 0.5 * base * height;

 }

 public static void main(String[] args) {

 AreaCalculator calc = new AreaCalculator();

 double circleArea = calc.area(5); // radius = 5

 double rectangleArea = calc.area(4, 6); // length = 4, breadth = 6

 double triangleArea = calc.area(4, 5, true); // base = 4, height = 5

 System.out.println("Area of Circle: " + circleArea);

 System.out.println("Area of Rectangle: " + rectangleArea);

 System.out.println("Area of Triangle: " + triangleArea);

 }

}
