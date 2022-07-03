package demo1;

public class Test {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.area(2));
        Circle circle = new Circle();
        System.out.println(String.format("%.2f", circle.area(3)));
    }
}
