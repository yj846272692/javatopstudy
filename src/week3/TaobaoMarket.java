package week3;

/**
 * @author 杨晶
 *  2019.03.10
 *  教材实例，定义抽象类
 */

public class TaobaoMarket  extends  Market{

    @Override
    public void shop() {
        System.out.println(name+ "网购" +goods);
    }
}
