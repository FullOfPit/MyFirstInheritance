package AnimalPackage;

public class Cat implements Animal{

    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String speak() {
        return null;
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String drink() {
        return null;
    }

    @Override
    public String sleep() {
        return null;
    }
}
