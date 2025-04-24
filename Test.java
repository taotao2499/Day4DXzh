package DXTest7;

public class Test {
    public static void main(String[] args) {

        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2：添加完毕之后，遍历所有学生信息。
        要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。
        要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/

        //1.
        Student[] arr = new Student[3];
        //2.
        Student s1 = new Student(1,"张三",18);
        Student s2 = new Student(2,"李四",19);
        Student s3 = new Student(3,"王五",20);

        //3.
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //4.要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student s4 = new Student(4,"赵六",21);

        //唯一性判断
        //已存在 不用添加
        // 不存在 就可以把学生对象添加进数组
        boolean flag = contains(arr, s4.getId());
        if (flag){
            //已存在 不用添加
            System.out.println("该学号已经存在，无需添加");
        }else {
            //不存在 就可以把学生对象添加进数组
            //1.数组已经存满只能创建一个新的数组，新数组的长度＝老数组+1
            //2.数组没有存满直接添加
            int count = getCount(arr);
            if  (count == arr.length){

                //1.数组已经存满只能创建一个新的数组，新数组的长度＝老数组+1
                Student[] newArr = createNewArr(arr);
                //.把学生对象添加到新数组中
                newArr[count] = s4;
                printArr(newArr);
            }else {
                  //2.数组没有存满直接添加
                arr[count] = s4;
                printArr(arr);
            }
        }
    }
    public static void  printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge());
            }
        }
    }
    public static  Student[] createNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    //定义一个方法，用于判断数组中是否包含某个学生对象
    public  static  int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static  boolean contains(Student[] arr,int id  ){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return true;
            }

            }
        }
        return false;
    }
}
