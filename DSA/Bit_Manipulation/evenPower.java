public class evenPower{
    public static boolean isPowerOfTwo(int n){
        return(n&(n-1))==0;
    }
    public static void main(String arg[]){
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(7));
    }
}