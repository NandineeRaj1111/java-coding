public class constructor {
    public static void main(String[] args) {
        Student student1 = new Student("Nandinee",19,9.5);
        Student student2 = new Student("Harshit",21,9);

        System.out.println((student1.name) + " " + ( student1.age)+ " "+( student1.gpa));
        // System.out.println(student1.gpa);
        // System.out.println(student2.name);
        System.out.println((student2.name) + " " + ( student2.age)+ " "+( student2.gpa));
        // System.out.println(student1.age);
        // System.out.println(student2.age);
        // System.out.println(student2.gpa);

    }
}
