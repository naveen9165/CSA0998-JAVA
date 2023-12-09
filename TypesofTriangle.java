public class TypesofTriangle {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean isRight() {
        return (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)
                || Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)
                || Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2));
    }
    public boolean isScalene() {
        return !isIsosceles();
    }
    public boolean isIsosceles() {
        return (side1 == side2 || side1 == side3 || side2 == side3);
    }
    public boolean isEquilateral() {
        return (side1 == side2 && side1 == side3);
    }
 
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Is right triangle? " + triangle.isRight());
        System.out.println("Is scalene triangle? " + triangle.isScalene());
        System.out.println("Is isosceles triangle? " + triangle.isIsosceles());
        System.out.println("Is equilateral triangle? " + triangle.isEquilateral());
    }
} 