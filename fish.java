public class fish implements prey,predator {
    @Override
    public void flee(){
        System.out.println("The small fish is swimming away");
    }
        @Override
    public void hunt(){
        System.out.println("The big fish is hunting");
    }
    
    
}
