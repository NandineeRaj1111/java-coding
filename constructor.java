public class constructor {
    public static void main(String[] args) {
        Student student1 = new Student("Nandinee",19,9.5);
        Student student2 = new Student("Harshit",21,9);
        Student student3 = new Student("Ayushman",21,8.6);

        System.out.println((student1.name) + " " + ( student1.age)+ " "+( student1.gpa));
        // System.out.println(student1.gpa);
        // System.out.println(student2.name);
        System.out.println((student2.name) + " " + ( student2.age)+ " "+( student2.gpa));
        // System.out.println(student1.age);
        // System.out.println(student2.age);
        // System.out.println(student2.gpa);
        System.out.println((student3.name) + " " + ( student3.age)+ " "+( student3.gpa));
        System.out.println();
        
        student1.study();
        student2.study();
        student3.study();
        System.out.println();

        
    }
}
