public class Constructer{
    public static void main(String args[]){
        Student s1 = new Student("Abhay");
        System.out.println(s1.name);
    }
}  
class Student{
    String name;
    int roll;

    Student(String name){
        // System.out.println("constructer is complete");
        this.name =name;
    }
}
    
