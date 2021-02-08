package src.com.bencyq.oop1;
public class Student {
    //属性
    String name;
    int age;

    //方法
    public void study(){
        System.out.println(name+"在学习");
    }
        public Student(String name){
        this.name=name;
    }
}
