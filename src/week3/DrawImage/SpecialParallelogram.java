package week3.DrawImage;
/**
 * @author 杨晶
 * 2019.03.10
 * 教材实例
 */

public class SpecialParallelogram {
    public static void main(String[] args) {
        //定义一维数组
        DrawImage[] images = {new Rectangle(),new Square(),new Diamond()};
        for(int i = 0; i < images.length; i++){
            //调用draw()方法
            images[i].draw();
        }
    }
}
