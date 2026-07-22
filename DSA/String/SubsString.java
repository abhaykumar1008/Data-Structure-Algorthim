public class SubsString{
    public static String subsString(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String arg[]){
        //
        String str = "Hello World";
        System.out.println(str.substring(0,5));
        System.out.println(subsString(str,0,5));
    }
}