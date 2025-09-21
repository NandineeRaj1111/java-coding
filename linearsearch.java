public class linearsearch {
    public static void main(String[] args) {
        int[] a={1,9,8,7,6};
        int item = 12;
        boolean isFound= false;

        for(int i=0;i<a.length;i++){
            if(item==a[i]){
                // or use if(a[i].equals(target))
            System.out.println("Element found at index:" +i);
            isFound=true;
            break;
            }
        }
        if(!isFound){
            System.out.println("Not found");
        }
            
        }
        
    }

