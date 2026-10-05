import java.util.ArrayList;
public class Operation {
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        // add element 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);
        System.out.println(list);

        // Get Operartion
        int element  = list.get(2);
        System.out.println(element);

        // Remove Operation
        list.remove(2);
        System.out.println(list);

        // Set Operation
        list.set(3,10);
        System.out.println(list);

        // Contains element Operation
        System.out.println(list.contains(1));
        System.out.println(list.contains(6));
    }
}