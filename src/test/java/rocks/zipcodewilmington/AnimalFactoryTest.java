package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Arrays;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void testCreateDog(){
        //Given
        Date date = new Date();
        //When
        DogHouse.add(AnimalFactory.createDog("Barf", date));
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCreateCat(){
        //Given
        Date date = new Date();
        //When
        CatHouse.add(AnimalFactory.createCat("Barf", date));
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
