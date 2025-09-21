public class varargs {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
        System.out.println(average(23,56,78,87));
    }

    static int add(int... numbers){
        int sum=0;
        for(int num : numbers){
            sum+=num;
        }
        return sum;
    }
    static double average(double... numbers){
        double sum=0;
        for(double num:numbers){
            sum+=num;
        }
        return sum;
    }
}
