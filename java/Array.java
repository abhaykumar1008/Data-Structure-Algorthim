// package java;
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
    /*public static void update(int marks[]){
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
    }*/



    // LINEAR SEARCH 
    /*public static int linearSearch(int numbers[],int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String arg[]){
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 14;

        int index = linearSearch(numbers,key);
        if(index==-1){
            System.out.println("Key not found in the array");
        }
        else{
            System.out.println("Key found at index :"+ index);
        }
    }*/


    // LARGEST NUMBER
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number :"+ smallest);
        return largest;
    }

    public static void main(String arg[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest number :"+ getlargest(numbers));
    }

}