public class missing_no {
    public static void main(String[] args) {
        int total;
        int[] numbers= new int[]{1,2,3,4,5,6,8};
        total=8;
        int expected_sum=(total*(total+1)/2);
        int sum=0;
        for(int i:numbers){
            sum+=i;
        }
        System.out.println(expected_sum-sum);
    }
}
