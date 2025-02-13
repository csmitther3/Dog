// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

import java.util.ArrayList;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {

        ArrayList<Animal> animalList = new ArrayList<>();

        Dog dog1 = new Dog("Parker");
        Dog dog2 = new Dog("Caden");
        Dog dog3 = new Dog("Greyson");

        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(dog3);

        dog1.setAge(15);
        dog2.setAge(17);
        dog3.setAge(16);

        for (Animal animal : animalList) {
            System.out.println("Age of " + ((Dog)animal).getName() + ": " + animal.getAge());

            animal.eat();

            System.out.println(((Dog)animal).bark());
        }
    }
}

       // ArrayList<Dog> dogList = new ArrayList<>();
     //   dogList.add(new Dog("Caden"));
     //   dogList.add(new Labrador("Parker", "Red"));
     //   dogList.add(new Yorkshire("Greyson", 10));

     //   for (int i = 0; i < dogList.size(); i++) {
      //      System.out.println(dogList.get(i).getName() + " says " + dogList.get(i).bark());
      //  }

      //  for (Dog dog : dogList) {
        //    System.out.println(dog.getName() + " says " + dog.bark());
      //  }

        //((Labrador) dogList.get(1)).waddle();


        //Dog dog = new Dog("Spike");
  // Labrador lab = new Labrador("Doggy", "Red"); // Object
       // System.out.println(dog.getName() + " says " + dog.bark());
        //There is no waddle method in the dog or lab class





      //  Yorkshire york = new Yorkshire("Yorky", 15);
      //  System.out.println(york.getName() + " says " + york.bark());
       // york.waddle();


       // Dog[] dogs = new Dog[3];
      // dogs[0] = new Dog("Caden");
     //  dogs[1] = new Labrador("Parker", "Red");
     //  dogs[2] = new Yorkshire("Greyson", 10);

//        for (int i = 0;i < dogs.length;i++){
//            System.out.println(dogs[i].bark());

//        }
//        for(Dog dog1 : dogs) {
//            System.out.println(dog1.bark());


//        ((Labrador)dogs[1]).waddle();





