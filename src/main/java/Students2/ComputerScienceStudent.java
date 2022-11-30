package Students2;

public class ComputerScienceStudent extends Student {

    String name;
    String[] classes;

    public ComputerScienceStudent(String name, int age){
        super(name, age);
    }

    @Override
    public String introduction() {
        return this.name;
    }
}
