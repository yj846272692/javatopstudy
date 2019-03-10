package week3.Shape;

/**
 * @author 杨晶
 * 2019.03.10
 * 教材P171 拓展训练一
 */

public  abstract class Shape {
    protected double x;
    protected double y;

    public Shape() {
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //声明了一个非抽象方法
    public void show(){
        System.out.println("面积为");
    }
    //声明了一个抽象方法
    public abstract double getArea();

}
