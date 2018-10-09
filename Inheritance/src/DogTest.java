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
		// Dog dog = new Dog("Spike");
		// System.out.println(dog.getName() + " says " + dog.speak());
		
		
		Yorkshire york = new Yorkshire("Ethan");
		System.out.println(york.getName() + " says " + york.speak());
		System.out.println(york.getName() + " has an avg weight of " + york.avgBreedWeight());

		
		Labrador lab = new Labrador("Paul","Black");
		System.out.println(lab.getName() + " says " + lab.speak());
		System.out.println(lab.getName() + " has an avg weight of " + lab.avgBreedWeight());


	}
}