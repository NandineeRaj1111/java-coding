public class string {
    public static void main(String[] args) {
        String s="Nandinee";
        s.concat("Raj");
        // concat() cant add Raj because string is immutable
        System.out.println(s);
    }
}
class name{
    public static void main(String[] args) {
        String name="Binit";
        name=name.concat(" Chaudhary");
        System.out.println(name);
    }
}
