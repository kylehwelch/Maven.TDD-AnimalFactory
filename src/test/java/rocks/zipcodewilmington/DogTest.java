package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // DONE - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // DONE - Create tests for `speak`
    // DONE - Create tests for `setBirthDate(Date birthDate)`
    // DONE - Create tests for `void eat(Food food)`
    // DONE - Create tests for `Integer getId()`
    // DONE - Create test to check Animal inheritance; google search `java instanceof keyword`
    // DONE - Create test to check Mammal inheritance; google search `java instanceof keyword`

    //Given


    //When


    //Then

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    public void testDogSpeak(){
        //Given
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 01);
        //When
        String expected = "bark!";
        String actual = dog.speak();
        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testDogBirthday(){
        //Given
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 01);

        //When
        Date expected = date;
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testDogEat(){
        //Given
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 01);
        Food chicken = new Food();
        //When
        dog.eat(chicken);
        int mealAct = dog.getNumberOfMealsEaten();
        int  mealExp = 1;
        //Then
        Assert.assertEquals(mealAct, mealExp);
    }
    @Test
    public void testDogID(){
        //Given
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 01);
        //When
        int expected = 1;
        int actual = dog.getId();
        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testDogAnimalInheritance(){
        //Given
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 01);
        //When
        boolean actual = dog instanceof Animal;
        boolean expected = true;
        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testDogMammalInheritance(){
        //Given
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 01);
        //When
        boolean actual = dog instanceof Mammal;
        boolean expected = true;
        //Then
        Assert.assertEquals(actual, expected);
    }
}
