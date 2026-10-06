import java.util.ArrayList;
import java.util.Collections;
public class Sorting{
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        // add element 
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before sorting: " + list);
        // ascending order
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // desecnding order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After descending sorting: " + list);
    }
}