package DXTest7;

public class Test2XiuGaiID {
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

        /*要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。*/
        int index = getIndex(arr, 2);
        if (index >= 0) {
            arr[index] = null;
            printArr(arr);
        }else {
            System.out.println("该学号不存在，无法删除");
        }
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
