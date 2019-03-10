package week3.Shape;

/**
 * @author 杨晶
 * 2019.03.10
 * 教材P171 拓展训练一
 */

public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle(3.5,4.5);
        shape.show();
        System.out.println(shape.getArea());
        Shape shape1 = new Rectangle(5.0,6.0);
        shape1.show();
        System.out.println(shape1.getArea());
    }
}
