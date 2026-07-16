public class count2d{
    public static int SearchCount(int[][] arr, int key){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String arg[]){
        int arr[][] ={{4,7,8},{8,8,7}};
        int key = 7;
        System.out.println("count of key is: "+SearchCount(arr,key));
    }
}