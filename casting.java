class Geeks{
    public static void main(String[] args) {
        int i=10;
        long l=i;
        double d=i;
        System.out.println("Integer:"+i);
        System.out.println("long:"+i);
        System.out.println("double:"+i);
        short j= (short)i;
        System.out.println("casted:"+j);
    

    }
}
// upcasting
class Animal{
    public void makesound(){
        System.out.println("animal makes sound");

    }
}
class Dog extends Animal{
    public void makesound(){
        System.out.println("the dog barks");
    }
    public void fetch(){
        System.out.println("the dog fetches the ball");
    }
}
class GFG{
    public static void main(String[] args) {
        Animal animal= new Dog();
        animal.makesound();
    //    animal.fetch(); gives a compile error as fetch is not a method in animal class
    }
}