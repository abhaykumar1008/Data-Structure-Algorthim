public class CountsetsBits{
    public static int CountSetsBit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main (String arg[]){
        System.out.println(CountSetsBit(10));
    }
}