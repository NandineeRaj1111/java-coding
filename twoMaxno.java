public class twoMaxno {
    public void printTwoMaxNumbers(int[] num){
        int max1=0;
        int max2=0;
        for(int n: num){
            if(max1<n){
                max2=max1;
                max1=n;
            }
            else if(max2<n){
                max2=n;
            }
        }
        System.out.println("First max no is " + max1);
        System.out.println("Second max no is "+ max2);
    }
    public static void main(String[] args) {
        int num[]={5,45,76,89,23,1,44};
         twoMaxno tmn = new twoMaxno(); //new obj of the class
        tmn.printTwoMaxNumbers(num); //method call using dot operator via obj
    }
}
