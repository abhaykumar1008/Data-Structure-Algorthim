public class Problem8{
    public static int lastOcc(int arr[], int i, int key){
        if(i==arr.length-1){
            return -1;
        }
        int isFound = lastOcc(arr,i+1,key);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String arg[]){
        int arr[] = {8,3,6,9,5,1,0,2,5,4};
        System.out.println(lastOcc(arr,0,5));
    }
}