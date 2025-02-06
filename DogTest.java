// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class DogTest
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
   Labrador lab = new Labrador("Doggy", "Red"); // Object
        System.out.println(dog.getName() + " says " + dog.bark());
        //There is no waddle method in the dog or lab class





        Yorkshire york = new Yorkshire("Yorky", 15);
        System.out.println(york.getName() + " says " + york.bark());
        york.waddle();


        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Caden");
        dogs[1] = new Labrador("Parker", "Red");
        dogs[2] = new Yorkshire("Greyson", 10);

        for (int i = 0;i < dogs.length;i++){
            System.out.println(dogs[i].bark());

        }
        for(Dog dog1 : dogs) {
            System.out.println(dog1.bark());

        }





    }
}
