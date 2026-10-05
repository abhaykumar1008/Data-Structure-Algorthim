import java.util.ArrayList;
public class SizeArray {
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        // add element 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.size());

        for(int i=0;i<list.size(); i++){
            System.out.println(list.get(i) + " ");

        }
        System.out.println();
    }
}