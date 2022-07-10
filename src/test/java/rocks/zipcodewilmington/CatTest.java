package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // DONE - Create tests for `void setName(String name)`
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
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName(){
        //Given
        String name = "Pickle";
        Date catBDay = new Date("2015/10/21");
        int id = 01;
        Cat cat = new Cat(name, catBDay, id);

        //When
        cat.setName("Pickle");
        String expected = "Pickle";

        //Then
        String actual = cat.getName();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCatspeak(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 01);

        //When
        String expected = "meow!";
        String actual = cat.speak();

        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testCatBirthday(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 01);

        //When
        Date expected = date;
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void catEatTest(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 01);
        Food chicken = new Food();
        //When
        cat.eat(chicken);
        int mealAct = cat.getNumberOfMealsEaten();
        int  mealExp = 1;
        //Then
        Assert.assertEquals(mealAct, mealExp);
    }
    @Test
    public void catGetID(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 01);
        //When
        int expected = 1;
        int actual = cat.getId();
        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void catTestAnimalInheritance(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 01);
        //When
        boolean actual = cat instanceof Animal;
        boolean expected = true;
        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void catTestMammalInheritance(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 01);
        //When
        boolean actual = cat instanceof Mammal;
        boolean expected = true;
        //Then
        Assert.assertEquals(actual, expected);
    }
}
