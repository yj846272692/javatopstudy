package week3.Shape;
/**
 * @author 杨晶
 * 2019.03.10
 * 教材P171 拓展训练一
 */

public class Circle extends Shape {
    public Circle() {
        super();
    }

    public Circle(double x, double y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("圆形的面积为：");
    }

    @Override
    public double getArea() {
        return super.x * super.y *super.x;
    }
}
