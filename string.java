public class string {
    public static void main(String[] args) {
        String s="Nandinee";
        s.concat("Raj");
        // concat() cant add Raj because string is immutable
        System.out.println(s);
        // string methods
        String name= "Harshit Gaur";
        int length=name.length();
        int index=name.indexOf(" ");
        char letter=name.charAt(0);
        int lastIndex=name.lastIndexOf("a");
         name=name.toUpperCase();
        // name=name.trim();
        // name=name.replace("i","u");
        System.out.println(name);
        if(name.isEmpty()){
            System.out.println("Name is empty");
        }
        else{
            System.out.println("NICE Name");
        }
        if(name.equals(s)){
            System.out.println("Name matched !!!");
        }
        else{
            System.out.println("Afsos! name didn't match ");
        }
        System.out.println(lastIndex);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);

        
    }
}
class name {
    public static void main(String[] args) {
        String name="Nandinee";
        name=name.concat(" Raj");
        System.out.println(name);
    }
}
