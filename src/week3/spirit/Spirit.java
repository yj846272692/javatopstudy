package week3.spirit;
/**
 * @author 杨晶
 * 2019.03.10
 * 教材练习
 */

public class Spirit {
    public static void main(String[] args) {
        MoveApp moveApp = new MoveApp();
        SingApp singApp = new SingApp();
        System.out.println("精灵们一边" + singApp.sing() + "，一边" + moveApp.move());
    }
}
