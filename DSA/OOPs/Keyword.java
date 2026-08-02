public class Keyword{
    public static void main(String arg[]){
        Student s1 = new Student();
        s1.schoolName = "KVC";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;


    void setNmae(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}