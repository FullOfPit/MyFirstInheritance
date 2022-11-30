package Students2;

public class Student {

    String name;
    int age;

    public Student() {
        this("N/A", -1);
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String introduction(){
        return "Hello, my name is: " + this.name;

    }

    public String respondWithName() {
        return this.name;
    }
}
