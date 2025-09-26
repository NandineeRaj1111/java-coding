class swap_string {
    public static void main(String[] args) {
        String a="Hello";
        String b="NR";
        System.out.println("Strings before swap are: "+ a+" "+ b);
        // append b to a
        a=a+b;
        // storing initial string into 2nd string
        b=a.substring(0, a.length()-b.length());
        // storing b in a;
        a=a.substring(b.length());
        System.out.println("after swapping: " +a +" "+ b);
    }
    
}
