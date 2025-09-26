public class StringReversePreserveSpace
 {
    static void reverses(String str){
        char[] arr=str.toCharArray();
        char[] result=new char[arr.length];
        // marking spaces
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                result[i]=' ';
            }
        }
        // traversing string from beg and putting char in result from end
        int j=result.length-1;
        for(int i=0;i<arr.length;i++){
            // ignoring space in input string
            if(arr[i]!=' '){
                // ignoring space in result
                if(result[j]==' '){
                    j--;
                }
                result[j]=arr[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }
    public static void main(String[] args) {
        reverses("NR is a self made billionaire");
    }
}
