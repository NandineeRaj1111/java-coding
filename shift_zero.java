class shift_zero {
    static void pushZerosToEnd(int arr[],int n){
        int c=0; //this is the count of non zero elements
        for(int i=0;i<n;i++){
            if(arr[i]!=0){ //the element is non zero
                arr[c++]=arr[i];// now  replacing the non zero element with the element at count
            }
        }
        // all the zeroes are at first
        while(c<n){
            arr[c++]=0; //making all element zero from count to end
        
        }

    }
    public static void main(String[] args) {
        int arr[]={1,4,0,8,6,0,7,3,5,0,2,1,0,6,9};
        int n= arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing all zeroes to end");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

