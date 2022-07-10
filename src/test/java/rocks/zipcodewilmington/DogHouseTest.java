package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

//    @Test
//    public void testGetNumberOfDogs() {
//        // Given (some
//        String name = "Milo";
//        Date birthDate = new Date();
//        Dog animal = AnimalFactory.createDog(name, birthDate);
//        DogHouse.clear();
//
//        // When
//        DogHouse.add(animal);
//
//        // Then
//        DogHouse.getNumberOfDogs();
//    }
    @Test
    public void testAddDog(){
        //Given
        DogHouse.clear();
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 1);
        //When
        DogHouse.add(dog);
        int numAct = DogHouse.getNumberOfDogs();
        Dog dogAct = DogHouse.getDogById(1);
        int numExp = 1;
        Dog dogExp = dog;
        //Then
        Assert.assertEquals(numExp, numAct);
        Assert.assertEquals(dogExp, dogAct);
    }
    @Test
    public void testRemoveDogId(){
        //Given
        DogHouse.clear();
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 1);
        //When
        DogHouse.add(dog);
        int numExp = 0;
        DogHouse.remove(1);
        int numAct = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(numExp, numAct);
    }
    @Test
    public void testRemoveDogDog(){
        //Given
        DogHouse.clear();
        Date date = new Date("2015/10/21");
        Dog dog = new Dog("a", date, 1);
        //When
        DogHouse.add(dog);
        int numExp = 0;
        DogHouse.remove(dog);
        int numAct = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(numExp, numAct);
    }
    @Test
    public void testGetDogById(){
        //Given
        DogHouse.clear();
        Date date = new Date("2015/10/21");
        Dog dog1 = new Dog("a", date, 1);
        Dog dog2 = new Dog("a", date, 2);
        //When
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        Dog actual = DogHouse.getDogById(2);
        Dog expected = dog2;
        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testGetNumDogs(){
        //Given
        DogHouse.clear();
        Date date = new Date("2015/10/21");
        Dog dog1 = new Dog("a", date, 1);
        Dog dog2 = new Dog("a", date, 2);
        //When
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        int actual = DogHouse.getNumberOfDogs();
        int expected = 2;
        //Then
        Assert.assertEquals(actual, expected);
    }
}
