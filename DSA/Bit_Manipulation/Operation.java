public class Operation{
    // GET Ith BIT
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // SET Ith Bit 
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n| bitMask;
    }

    // CLEAR Ith Bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // UPDATE Ith Bit
    public static int updateIthBit(int n, int i, int newBit){
        if(newBit ==0){
            return clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }
    }
    
    // Clear Last Of Two bit
    public static int clearLastBit(int n, int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }

    // Clear Range of bits
    public static int ClearBitsRange(int n, int i, int j ){
        int a =((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }
    public static void main(String args[]){
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearLastBit(15,2));
        System.out.println(ClearBitsRange(10,2,4));
    }

    
}