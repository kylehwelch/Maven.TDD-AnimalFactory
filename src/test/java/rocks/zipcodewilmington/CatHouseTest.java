package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // DONE - Create tests for `void add(Cat cat)`
    // DONE - Create tests for `void remove(Integer id)`
    // DONE - Create tests for `void remove(Cat cat)`
    // DONE - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    //Given


    //When


    //Then


    @Test
    public void testAddCat(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 1);
        //When
        CatHouse.add(cat);
        int numAct = CatHouse.getNumberOfCats();
        Cat catAct = CatHouse.getCatById(1);
        int numExp = 1;
        Cat catExp = cat;
        //Then
        Assert.assertEquals(numAct, numExp);
        Assert.assertEquals(catAct, catExp);
    }
    @Test
    public void testRemoveCatId(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 1);
        //When
        CatHouse.add(cat);
        int numExp = 0;
        CatHouse.remove(1);
        int numAct = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(numAct, numExp);
    }
    @Test
    public void testRemoveCatCat(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat = new Cat("a", date, 1);
        //When
        CatHouse.add(cat);
        int numExp = 0;
        CatHouse.remove(cat);
        int numAct = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(numAct, numExp);
    }
    @Test
    public void testGetCatById(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat1 = new Cat("a", date, 1);
        Cat cat2 = new Cat("b", date, 2);
        //When
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        Cat actual = CatHouse.getCatById(2);
        Cat expected = cat2;
        //Then
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testGetNumCats(){
        //Given
        Date date = new Date("2015/10/21");
        Cat cat1 = new Cat("a", date, 1);
        Cat cat2 = new Cat("b", date, 2);
        //When
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        int actual = CatHouse.getNumberOfCats();
        int expected = 2;
        //Then
        Assert.assertEquals(actual, expected);
    }



}
