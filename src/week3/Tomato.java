package week3;

import java.util.Scanner;

/**
 * @author 杨晶
 * 2019.03.11
 * 捕捉控制台输入商品单价后的异常
 */

public class Tomato {
    public static void main(String[] args) {
        //创建控制台输入对象
        Scanner sc = new Scanner(System.in);
        //控制台输出提示信息
        System.out.println("今天的西红柿单价(单价格式为“3.00”)：");
        String dayPrice = sc.next();
        if (dayPrice.length() ==4){
            try {
                String message = "西红柿：" +dayPrice +"元/500克";
                String[] strArr = message.split(":");
                String unitPriceStr = strArr[2].substring(0,4);
                double weight = 650;
                double unitPriceDou = Double.parseDouble(unitPriceStr);
                System.out.println(message+"，顾客买了"+weight +"克的西红柿,需支付"
                +(float)(weight/500 * unitPriceDou)+"元");
            }catch (ArrayIndexOutOfBoundsException aiobe){
                aiobe.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                sc.close();
                System.out.println("控制台输入对象被关闭");
            }
        }else{
            System.out.println("违规操作："+"输入西红柿单价时小数点须保留两位有效数字(如3.00)!");
        }

    }
}
