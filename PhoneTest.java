package DXTest5;

public class PhoneTest {
    public static void main(String[] args) {

        Phone[] arr = new Phone[3];

        //
        Phone phone1 = new Phone("小米", 1999, "白色");
        Phone phone2 = new Phone("华为", 4399, "黑色");
        Phone phone3= new Phone("魅族", 3399, "玫瑰金");

        //
        arr[0] = phone1;
        arr[1] = phone2;
        arr[2] = phone3;

        //
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        System.out.println("手机总价格为：" + sum);

        //
        int avg = sum / arr.length;
        System.out.println("手机平均价格为：" + avg);
    }
}
