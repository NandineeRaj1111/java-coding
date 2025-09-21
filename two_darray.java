public class two_darray {
    public static void main(String[] args) {
        // String[] fruits={"apple","banana","kiwi","guava"};
        // String[] items={"book","copy","pen","pencil"};
        // String[] veg={"potato","tomato","chilli","coriander"};

        String[][] names= {{"NR","HG","AJ"},
                            {"CSAIML","CSAI","IT"},
                            {"GLB","GLB","GLB"}};
        names[0][1]="Harshu";
        names[0][0]="Nandu";
        names[0][2]="Haggu";
                             
        for(String[] name:names){
            for(String about:name){
                System.out.print(about +" ");
            }
            System.out.println();
        }
        int[][] records={{99,98,95},
                        {19,21,21},
                        {65,64,63}};
        for(int[] record:records){
            for(int data:record){
                System.out.print(data +" ");

            }
            System.out.println();
        }
    }
}
