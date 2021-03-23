package Student;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String id , String name , int math , int english , int thesis){
        super(id , name , math ,english);
        this.thesis = thesis;
    }
}

