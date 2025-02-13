package src;

class Student {
    String name;
    int age;
    int marks;
    Student(){
        System.out.println("default constructor");
    }
    Student(String name,    int age,    int marks){
        System.out.println("parameter constructor");
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(marks);
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void info(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
    }

 }
public class App {
    public static void main(String[] args) throws Exception {

        // Student s1 = new Student();
        // s1.name = "lavanya";
        // s1.age = 25;
        // s1.marks = 90;
        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.marks);
        // s1.info();

        Student s2 = new Student("ram",25,96);
        s2.info();  

    }
}
