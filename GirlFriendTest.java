package DXTest6;

public class GirlFriendTest {
    public static void main(String[] args) {

        GirlFriend[] arr = new GirlFriend[4];

        //
        GirlFriend gif1 = new GirlFriend("小诗诗", 18, "萌妹子", "吃零食");
        GirlFriend gif2 = new GirlFriend("小丹丹", 1, "萌妹子", "玩游戏");
        GirlFriend gif3 = new GirlFriend("小棉袄", 20, "萌妹子", "逛街");
        GirlFriend gif4 = new GirlFriend("小雪梨", 21, "憨妹子", "看电影");

        //
        arr[0] = gif1;
        arr[1] = gif2;
        arr[2] = gif3;
        arr[3] = gif4;

        //
        int sun = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];
            sun = sun + girlFriend.getAge();
        }

        //
        int avg = sun / arr.length;

        //
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
            }
        }

        System.out.println("年龄小于平均值的个数为：" + count);
    }
}
