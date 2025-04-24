package DXTest7;

public class Test3YaoQiu5 {
    public static void main(String[] args) {
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

        //要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/
        int index = getIndex(arr, 2);
        if (index >= 0) {
            Student stu = arr[index];
            int age = stu.getAge();
            stu.setAge(age+1);
        }else {
            System.out.println("该学号不存在，无法修改");
        }
        printArr(arr);


    }
    public  static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null ){
                int sid = stu.getId();
                return i;
            }
        }
        return -1;
    }
    public static void  printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAge());
            }
        }
    }
}
