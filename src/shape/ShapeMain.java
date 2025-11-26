package shape;

public class ShapeMain {
    public static void main(String[] args) {

        Circle circle = new Circle(8);
        System.out.printf("Area: %.2f cm²\n",circle.getArea());
        System.out.printf("Type: %s\n",circle.getType());

        Triangle triangle = new Triangle(8, 8);
        System.out.printf("Area: %.2f cm²\n",triangle.getArea());
        System.out.printf("Type: %s\n",triangle.getType());

        Rectangle rectangle = new Rectangle(8, 8);
        System.out.printf("Area: %.2f cm²\n",rectangle.getArea());
        System.out.printf("Type: %s\n",rectangle.getType());
    }
}
