package DXTest4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        //
        Car[] arr = new Car[3];

        //2.//键盘录入汽车数据
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car c = new Car();
            //录入品牌
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车价格");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车颜色");
            String color = sc.next();
            c.setColor(color);

            //把汽车对象添加到数组中
            arr[i] = c;
        }
        //3.//遍历数组，获取每一个汽车对象的数据，打印在控制台
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }
    }
}
