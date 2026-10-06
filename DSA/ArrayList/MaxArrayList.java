import java.util.ArrayList;
public class MaxArrayList {
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        // add element 
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max element is: " + max);
    }
}