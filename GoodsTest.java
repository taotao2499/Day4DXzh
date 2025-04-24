package DXTest3;

public class GoodsTest {
    public static void main(String[] args) {

        //创建一个数组
        Goods[] goods = new Goods[3];
        //创建对象
        goods[0] = new Goods("1","手机",1000,10);
        goods[1] = new Goods("2","电脑",2000,20);
        goods[2] = new Goods("3","手机",1000,10);

        //遍历数组    输出数组中的对象
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId() + " " + goods[i].getName() + " " + goods[i].getPrice() +
                    " " + goods[i].getCount());
        }
    }
}
