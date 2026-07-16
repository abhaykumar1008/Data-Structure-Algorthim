public class Print2ndRow{
    public static void Sum2ndRow(int [][] nums){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(i==1){
                    sum+=nums[i][j];
                }
                
            }
        }
        System.out.println("sum of 2nd row is: "+sum);
    }
    public static void main(String arg[]){
        int nums[][] ={{1,4,9},{11,4,3},{2,2,3}};
        Sum2ndRow(nums);
    }

}