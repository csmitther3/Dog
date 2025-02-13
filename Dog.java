// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//          
// ****************************************************************
public class Dog extends Animal
{
    public String name;
    public Dog(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String bark() {
        return "Woof! " + name + " is barking!";
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

