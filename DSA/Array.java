import java.util.*;
public class Array{
    //public static void main (String [] arr){
        //int marks[] = new int[50];
        //int [] numbers = {1,2,3,4,5};
        //String [] names = {"Abhay" , "Sanya" , "Rohit"};

        //System.out.println(Arrays.toString(marks));
        //System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.toString(names));
        
        //Scanner sc = new Scanner(System.in);
        //marks[0] = sc.nextInt();
        //marks [1] = sc.nextInt();
        //marks [2] = sc.nextInt();
    
        //System.out.println("phy :" + marks[0]); 
        //System.out.println("chem :"+ marks[1]);
        //System.out.println("maths :"+ marks[2]);
    
        // percentage
        //int percentage = (marks[0]+marks[1]+marks[2])/3;
        //System.out.println("Percentage :"+ percentage +"%");
    
        /* length of array
        //System.out.println("Length of array :"+ marks.length);
    }*/
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main (String [] arr){
        int marks[] = {97,98,99};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }

}