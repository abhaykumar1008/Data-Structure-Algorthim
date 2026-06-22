public class Subarrays{
    public static void PrintSubarrays(int numbers[]){
        int ts=0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j =i ; j<numbers.length; j++){
                int end = j;
                for(int k =start ; k<=end ; k++){
                    System.out.print(numbers[k]+ " ");

                }
                ts++;
                System.out.println();
            }
            System.out.println("Total subarrays : " + ts);
        }
        System.out.println("Total pairs :"+ ts);
    }
    public static void main(String arg[]){
        int numbers[] = {2,4,6,8,10};
        PrintSubarrays(numbers);
    }
}