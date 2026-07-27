public class Basic{
    public static void main(String arg[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip (int newTip){
        tip = newTip;
    }
}
class student {
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}