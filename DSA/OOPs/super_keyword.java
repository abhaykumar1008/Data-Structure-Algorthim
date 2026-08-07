public class super_keyword{
    public static void main (String arg[]){
        Horse h = new Horse();
        System.out.println("Horse color is: " + h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal class constructor");
    }
}

class Horse extends Animal{
    Horse(){
        super.color  = "Brown";
        System.out.println("Horse class constructor");
    }
}