package lesson2.Rectangle;

public class RectangleRun {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(12, 32);
        Rectangle rectangle2 = new Rectangle(22, 39);
        Rectangle rectangle3 = new Rectangle(32, 21);
        Rectangle rectangle4 = new Rectangle(42, 12);

        Rectangles rectangles = new Rectangles();

        rectangles.addRectangle(rectangle1);
        rectangles.addRectangle(rectangle2);
        rectangles.addRectangle(rectangle3);
        rectangles.addRectangle(rectangle4);

        System.out.println(rectangles.getSquareAllRectangle());
        System.out.println(rectangles.getSquareAllRectangleStream());
    }


}
