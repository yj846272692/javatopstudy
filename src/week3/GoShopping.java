package week3;

/**
 * @author 杨晶
 * 2019.03.10
 * 去超市购物实例
 */

public class GoShopping {
    public static void main(String[] args) {
        //使用派生类对象创建抽象类对象
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}
