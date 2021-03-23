package Student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String id , String name , int math , int english){
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print(){
        System.out.println(id + "\t" + name + "\t" + english + "\t" + math + "\t" + (english+math)/2);
    }
}
