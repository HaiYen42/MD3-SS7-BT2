package rikkei.academy;

public class Main {

    public static void main(String[] args) {
	    // Kiểm thử class Shape
        Shape array[]= new Shape[6];
        array[0]= new Square(5);
        array[1]= new Rectangle(5, 6);
        array[2]= new Circle(7);
        array[3]= new Square(10);
        array[4]= new Rectangle(2, 3);
        array[5]= new Circle(4);

        for (Shape shape:array) {
            if (shape instanceof Colorable) {
                Square square=(Square) shape;//ép shape về Square
                System.out.println("Diện tích hình colorable là "+  square.getArea());
                square.howToColor();
            }
        }
    }

}
