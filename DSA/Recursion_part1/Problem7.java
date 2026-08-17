public class Problem7{
    public static int firstOcc(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,i+1,key);
    }
    public static void main(String arg[]){
        int arr[] = {8,3,6,9,5,1,0,2,5,4};
        System.out.println(firstOcc(arr,0,5));
    }
}